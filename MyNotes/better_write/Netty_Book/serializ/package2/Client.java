package better_write.Netty_Book.serializ.package2;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class Client {


    public void connect(int port,String host) {

        EventLoopGroup group = new NioEventLoopGroup();

        try {

            Bootstrap bootstrap = new Bootstrap();

            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {

                            socketChannel.pipeline().addLast(
                                    new ObjectDecoder(
                                            1024,
                                            ClassResolvers.cacheDisabled(
                                                    this.getClass().getClassLoader()
                                            )
                                    )
                            );

                            socketChannel.pipeline().addLast(new ObjectEncoder());

                            socketChannel.pipeline().addLast(new ClientHandler());


                        }
                    });


            ChannelFuture future = bootstrap.connect(host,port).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            group.shutdownGracefully();

        }


    }

    public static void main(String[] args) {

        new Client().connect(9903,"localhost");

    }
}
