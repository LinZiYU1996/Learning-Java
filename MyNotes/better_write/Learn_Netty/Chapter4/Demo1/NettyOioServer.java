package better_write.Learn_Netty.Chapter4.Demo1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.oio.OioServerSocketChannel;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 11:21
 * \* Description:
 * \
 */
public class NettyOioServer {
/*
使用 Netty 的阻塞网络处理
 */
    public void server(int port) throws InterruptedException {

        final ByteBuf buf = Unpooled.unreleasableBuffer(
                Unpooled.copiedBuffer("Hi!\r\n", Charset.forName("UTF-8"))
        );

        EventLoopGroup group = new OioEventLoopGroup();

        ServerBootstrap b = new ServerBootstrap();

        b.group(group)

                /*
                使用 OioEventLoopGroup
                以允许阻塞模式（旧的
                I/O）
                 */
                .channel(OioServerSocketChannel.class)
                .localAddress(new InetSocketAddress(port))

                /*
                指定 Channel-
                Initializer，对于
                每个已接受的
                连接都调用它
                 */
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch)
                            throws Exception {
                        ch.pipeline().addLast(

                                /*
                                添加一个Channel-
                                InboundHandler-
                                Adapter 以拦截和
                                处理事件
                                 */
                                new ChannelInboundHandlerAdapter() {
                                    @Override
                                    public void channelActive(
                                            ChannelHandlerContext ctx)
                                            throws Exception {
                                        ctx.writeAndFlush(buf.duplicate())
                                                .addListener(
                                                        /*
                                                        将消息写到客户端，并添
                                                        加 ChannelFutureListener，
                                                        以便消息一被写完就关闭
                                                        连接
                                                         */
                                                        ChannelFutureListener.CLOSE);
                                    }
                                });
                    }
                });


        ChannelFuture f = b.bind().sync();
        f.channel().closeFuture().sync();


        group.shutdownGracefully().sync();


    }
}
