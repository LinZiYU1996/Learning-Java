package better_write.Learn_Netty.Chapter4.Demo1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 11:28
 * \* Description:
 * \
 */
public class NettyNioServer {


    public void server(int port) throws Exception {


        final ByteBuf buf = Unpooled.copiedBuffer(
                "Hi!\r\n",
                Charset.forName("UTF-8")
        );

        EventLoopGroup group = new NioEventLoopGroup();

        ServerBootstrap b = new ServerBootstrap();

        b.group(group)
                .channel(NioServerSocketChannel.class)
                .localAddress(new InetSocketAddress(port))
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {

                        socketChannel.pipeline().addLast(
                                new ChannelInboundHandlerAdapter(){
                                    @Override
                                    public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                        ctx.writeAndFlush(buf.duplicate())
                                                .addListener(
                                                        ChannelFutureListener.CLOSE
                                                );
                                    }
                                }
                        );

                    }
                });



        ChannelFuture f = b.bind().sync();

        f.channel().closeFuture().sync();

        group.shutdownGracefully().sync();


    }
}
