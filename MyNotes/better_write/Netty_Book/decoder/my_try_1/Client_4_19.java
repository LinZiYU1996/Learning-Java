package better_write.Netty_Book.decoder.my_try_1;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:25
 * \* Description:
 * \
 */
public class Client_4_19 {

    public void connect(String host, int port) {

        EventLoopGroup group = new NioEventLoopGroup();

        try {

            Bootstrap bootstrap = new Bootstrap();

            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new ProtocolEncoder());
                            socketChannel.pipeline().addLast(new ClientHandler_4_19());
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


    public static void main(String[] args) {

        new Client_4_19().connect("localhost",9922);

    }

}
