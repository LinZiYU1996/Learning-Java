package better_write.Netty_Book.Http.package1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpResponseDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 19:31
 * \* Description:
 * \
 */
public class HttpServer {


    private static final String DEFAULT_URL = "E:\\learn-java\\Learning-Java";

    public void run(final int port, final String url) {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {

            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {

                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {

                            socketChannel.pipeline().addLast(
                                    "http-decoder",
                                    new HttpResponseDecoder()
                            );

                            socketChannel.pipeline().addLast(
                                    "http-aggregator",
                                    new HttpObjectAggregator(65536)
                            );

                            socketChannel.pipeline().addLast(
                                    "http-encoder",
                                    new HttpResponseEncoder()
                            );

                            socketChannel.pipeline().addLast(
                                    "http-chunked",
                                    new ChunkedWriteHandler()
                            );

                            socketChannel.pipeline().addLast(
                                    "fileServerHandler",
                                    new HttpServerHandler(url)

                            );

                        }
                    });

            ChannelFuture future = b.bind(
                    "127.0.0.1",
                    port
            ).sync();

            System.out.println("HTTP文件目录服务器启动，网址是 : " + "http://127.0.0.1:"
                    + port + url);

            future.channel().closeFuture().sync();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }


    }

    public static void main(String[] args) {

        int port = 9966;

//        if (args.length > 0) {
//
//            try {
//
//                port = Integer.parseInt(args[0]);
//
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//
//        }

        String url = DEFAULT_URL;

//        if (args.length > 1) {
//            url = args[1];
//        }

        new HttpServer().run(port,url);

    }
}
