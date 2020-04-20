package better_write.Netty_Book.serializ.package2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 21:48
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
                            socketChannel.pipeline()
                                    .addLast(
                                            new ObjectDecoder(
                                                    1024*1024,
                                                    ClassResolvers.weakCachingConcurrentResolver(
                                                            this.getClass().getClassLoader()
                                                    )
                                            )
                                    );

                            socketChannel.pipeline().addLast(new ObjectEncoder());
                            socketChannel.pipeline().addLast(new ServerHandler());

                        }
                    });


            ChannelFuture future = sb.bind(port).sync();
            System.out.println("server bind port:{}    "+ + port);

            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            boss.shutdownGracefully();
            worker.shutdownGracefully();

        }


    }

    public static void main(String[] args) {

        new Server().bind(9903);

    }

}
