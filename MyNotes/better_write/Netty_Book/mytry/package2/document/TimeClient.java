package better_write.Netty_Book.mytry.package2.document;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/16
 * \* Time: 10:17
 * \* Description:
 * \
 */
public class TimeClient {


    public static void main(String[] args) throws InterruptedException {

        String host = args[0];

        int port = Integer.parseInt(args[1]);

        EventLoopGroup work = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(work)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.SO_KEEPALIVE,true)
                    .handler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline()
                                    .addLast(new TimeClientHandler());
                        }
                    });


            ChannelFuture future = b.connect(host,port).sync();
            future.channel().closeFuture().sync();
        } finally {
            work.shutdownGracefully();
        }



    }
}
