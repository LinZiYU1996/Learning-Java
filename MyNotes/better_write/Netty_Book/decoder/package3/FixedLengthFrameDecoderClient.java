package better_write.Netty_Book.decoder.package3;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/17
 * \* Time: 11:42
 * \* Description:
 * \
 */
public class FixedLengthFrameDecoderClient {

    public static void main(String[] args) throws Exception {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap(); // (1)
            b.group(workerGroup); // (2)
            b.channel(NioSocketChannel.class); // (3)
            b.option(ChannelOption.SO_KEEPALIVE, true); // (4)
            b.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                        //在于server建立连接后，即发送请求报文
                        public void channelActive(ChannelHandlerContext ctx) {
                            ByteBuf A = Unpooled.buffer().writeBytes("A".getBytes());
                            ByteBuf BC = Unpooled.buffer().writeBytes("BC".getBytes());
                            ByteBuf DEFG = Unpooled.buffer().writeBytes("DEFG".getBytes());
                            ByteBuf HI = Unpooled.buffer().writeBytes("HI".getBytes());
                            ctx.writeAndFlush(A);
                            ctx.writeAndFlush(BC);
                            ctx.writeAndFlush(DEFG);
                            ctx.writeAndFlush(HI);
                        }
                    });
                }
            });
            // Start the client.
            ChannelFuture f = b.connect("127.0.0.1",9911).sync(); // (5)
            // Wait until the connection is closed.
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }


}
