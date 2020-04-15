package better_write.Netty_Book.mytry.package1.the_Netty;

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
 * \* Date: 2020/4/14
 * \* Time: 21:48
 * \* Description:
 * \
 */
public class NeClient {

    final String host;

    final int port;

    public NeClient(String host, int port) {
        this.host = host;
        this.port = port;
    }


    public void client_run() throws InterruptedException {

        EventLoopGroup group = new NioEventLoopGroup();

        Bootstrap b = new Bootstrap();

        b.group(group)
                .channel(NioSocketChannel.class)
                .remoteAddress(new InetSocketAddress(host,port))
                .handler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(new ClientHandler());
                    }
                });

        ChannelFuture f = b.connect().sync();
        f.channel().closeFuture().sync();

        group.shutdownGracefully();

    }

    public static void main(String[] args) throws InterruptedException {

        NeClient client = new NeClient("localhost",9966);

        client.client_run();
//        while (true) {
//            client.client_run();
//            Thread.sleep(2000);
//        }

    }
}
