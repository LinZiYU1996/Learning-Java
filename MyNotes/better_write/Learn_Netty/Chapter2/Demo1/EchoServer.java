package better_write.Learn_Netty.Chapter2.Demo1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 10:12
 * \* Description:
 * \
 */
public class EchoServer {

    /*
    对于所有的客户端连接来说，都会使用同一个 EchoServerHandler
     */
    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws InterruptedException {

        if (args.length != 1) {
            System.out.println("Usage: "
            + EchoServer.class.getSimpleName()
            +"<port>");
        }

        int port = Integer.parseInt(args[0]);

        new EchoServer(port).start();

    }

    public void start() throws InterruptedException {

        final EchoServerHandler serverHandler = new EchoServerHandler();

        EventLoopGroup group = new NioEventLoopGroup();

        try {

            /*
            创建了一个ServerBootstrap 实例。因为你正在使用的是NIO 传输，所以你指定
            了 NioEventLoopGroup 来接受和处理新的连接，并且将 Channel 的类型指定为 NioServer-
            SocketChannel 。在此之后，你将本地地址设置为一个具有选定端口的 InetSocket-
            Address 。服务器将绑定到这个地址以监听新的连接请求。
             */
            ServerBootstrap b = new ServerBootstrap();

            /*
            特殊的类——ChannelInitializer。这是关键。当一个新的连接
            被接受时，一个新的子 Channel 将会被创建，而 ChannelInitializer 将会把一个你的
            EchoServerHandler 的实例添加到该 Channel 的 ChannelPipeline 中。正如我们之前所
            解释的，这个 ChannelHandler 将会收到有关入站消息的通知
             */
            b.group(group)
                    .channel(NioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(port))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(serverHandler);
                        }
                    });

            /*
            绑定了服务器 ，并等待绑定完成。（对 sync()方法的调用将导致当前 Thread
            阻塞，一直到绑定操作完成为止）。
             */
            ChannelFuture f = b.bind().sync();

            /*
            该应用程序将会阻塞等待直到服务器的 Channel
            关闭（因为你在 Channel 的 CloseFuture 上调用了 sync()方法）。然后，你将可以关闭
            EventLoopGroup，并释放所有的资源，包括所有被创建的线程
             */
            f.channel().closeFuture().sync();

        } finally {
            group.shutdownGracefully().sync();
        }
    }
}

/*
这个示例使用了 NIO，因为得益于它的可扩展性和彻底的异步性，它是目前使用最广泛的传
输。但是也可以使用一个不同的传输实现。如果你想要在自己的服务器中使用 OIO 传输，将需
要指定 OioServerSocketChannel 和 OioEventLoopGroup。

服务器的主要
代码组件：
EchoServerHandler 实现了业务逻辑；
main()方法引导了服务器；
引导过程中所需要的步骤如下：
创建一个 ServerBootstrap 的实例以引导和绑定服务器；
创建并分配一个 NioEventLoopGroup 实例以进行事件的处理，如接受新连接以及读/
写数据；
指定服务器绑定的本地的 InetSocketAddress；
使用一个 EchoServerHandler 的实例初始化每一个新的 Channel；
调用 ServerBootstrap.bind()方法以绑定服务器。
 */