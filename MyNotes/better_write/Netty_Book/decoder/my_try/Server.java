package better_write.Netty_Book.decoder.my_try;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 9:53
 * \* Description:
 * \
 */
public class Server {


    public void bind(int port) {

        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        try {

            ServerBootstrap sb = new ServerBootstrap();
            sb.group(boss,worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
//                                socketChannel.pipeline().addLast(new LengthFieldBasedFrameDecoder(
//                                        1024,
//                                        0,
//                                        2,
//                                        0,
//                                        2
//
//                                ));
                            socketChannel.pipeline().addLast(new StringDecoder());
                                socketChannel.pipeline().addLast(new ServerHandler());
                        }
                    });

            ChannelFuture f = sb.bind(port).sync();
            System.out.println("server run.........");
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();

        }

    }


    public static void main(String[] args) {


        new Server().bind(9988);
    }


}
