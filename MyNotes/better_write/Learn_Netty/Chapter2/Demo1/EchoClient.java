package better_write.Learn_Netty.Chapter2.Demo1;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 10:27
 * \* Description:
 * \
 */
public class EchoClient {

    private final String host;

    private final int port;

    public EchoClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws InterruptedException {

        EventLoopGroup group = new NioEventLoopGroup();

        try {

            Bootstrap b = new Bootstrap();

            b.group(group)
                    .channel(NioSocketChannel.class)
                    .remoteAddress(new InetSocketAddress(host,port))
                    .handler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new EchoClientHandler());
                        }
                    });

            ChannelFuture f = b.connect().sync();
            f.channel().closeFuture().sync();
        } finally {

            group.shutdownGracefully().sync();
        }


    }

    public static void main(String[] args) throws InterruptedException {

        if (args.length != 2) {
            System.err.println(
                    "Usage: " + EchoClient.class.getSimpleName() +
                            " <host> <port>");
            return;
        }
        String host = args[0];
        int port = Integer.parseInt(args[1]);
        new EchoClient(host, port).start();


    }
}
/*
和之前一样，使用了 NIO 传输。注意，你可以在客户端和服务器上分别使用不同的传输。
例如，在服务器端使用 NIO 传输，而在客户端使用 OIO 传输
 */

/*

为初始化客户端，创建了一个 Bootstrap 实例；

为进行事件处理分配了一个 NioEventLoopGroup 实例，其中事件处理包括创建新的
连接以及处理入站和出站数据；
为服务器连接创建了一个 InetSocketAddress 实例；
当连接被建立时，一个 EchoClientHandler 实例会被安装到（该 Channel 的）
ChannelPipeline 中；
在一切都设置完成后，调用 Bootstrap.connect()方法连接到远程节点




 */