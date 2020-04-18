package better_write.Netty_Book.decoder.package4;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringEncoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/17
 * \* Time: 17:36
 * \* Description:
 * \
 */
public class LengthFieldBasedFrameDecoderClient {


    public static void main(String[] args) {

        int port = 9966;

        String host = "localhost";

        EventLoopGroup group = new NioEventLoopGroup();

        try {

            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {


                            ch.pipeline().addLast(new LengthFieldPrepender(2,0,false));
                            ch.pipeline().addLast(new StringEncoder());
                            ch.pipeline().addLast(new LengthFieldClientHandler());

                        }
                    });


            ChannelFuture f = bootstrap.connect(host,port).sync();
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }

    }
}
