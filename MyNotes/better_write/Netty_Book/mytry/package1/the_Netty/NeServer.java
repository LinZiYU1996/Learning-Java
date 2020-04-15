package better_write.Netty_Book.mytry.package1.the_Netty;

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
 * \* Date: 2020/4/14
 * \* Time: 21:40
 * \* Description:
 * \
 */
public class NeServer {


    final ServerHandler serverHandler = new ServerHandler();

    final int port;

    public NeServer(int port) {
        this.port = port;
    }

    public void server_run() throws InterruptedException {

        EventLoopGroup group = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();

        serverBootstrap
                .group(group)
                .channel(NioServerSocketChannel.class)
                .localAddress(new InetSocketAddress(port))
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(serverHandler);
                    }
                });


        ChannelFuture future = serverBootstrap.bind().sync();
        future.channel().closeFuture().sync();

        group.shutdownGracefully();

    }

    public static void main(String[] args) throws InterruptedException {

        new NeServer(9966).server_run();

    }
}
