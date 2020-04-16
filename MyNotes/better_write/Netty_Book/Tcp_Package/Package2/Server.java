package better_write.Netty_Book.Tcp_Package.Package2;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;



/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/15
 * \* Time: 10:33
 * \* Description:
 * \
 */
public class Server {

    public void bind(int port) {

        EventLoopGroup bossG = new NioEventLoopGroup();
        EventLoopGroup workerG = new NioEventLoopGroup();

        try {

            ServerBootstrap sb = new ServerBootstrap();
            sb.group(bossG,workerG)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG,1024)
                    .childHandler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new LineBasedFrameDecoder(1024));
                            socketChannel.pipeline().addLast(new StringDecoder());
                            socketChannel.pipeline().addLast(new ServerHandler());
                        }
                    });

            ChannelFuture future = sb.bind(port).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bossG.shutdownGracefully();
            workerG.shutdownGracefully();
        }


    }

    public static void main(String[] args) {

        new Server().bind(6633);

    }

}
