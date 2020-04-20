package better_write.Netty_Book.decoder.my_try_1;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;


/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:13
 * \* Description:
 * \
 */
public class Server_4_19 {


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
                            socketChannel.pipeline().addLast(new NewProtocolDecoder(65536,
                                    0,
                                    2,
                                    0,
                                    0));
//                            socketChannel.pipeline().addLast(new ProtocolDecoder());
                            socketChannel.pipeline().addLast(new ServerHandler_4_19());
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

        new Server_4_19().bind(9922);


    }


}
