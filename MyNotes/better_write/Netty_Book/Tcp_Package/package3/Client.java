package better_write.Netty_Book.Tcp_Package.package3;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/16
 * \* Time: 11:42
 * \* Description:
 * \
 */
public class Client {

    public void connect(String host, int port) throws InterruptedException {

        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
//                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {

                            ChannelPipeline p = ch.pipeline();
//                            p.addLast(new LineBasedFrameDecoder(1024));
//                            p.addLast(new StringDecoder());
//                            p.addLast(new StringEncoder());

                            p.addLast(new ClientHandler());
                        }
                    });

            ChannelFuture future = b.connect(host, port).sync();

            future.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {

        new Client().connect("localhost",9988);
    }


}
