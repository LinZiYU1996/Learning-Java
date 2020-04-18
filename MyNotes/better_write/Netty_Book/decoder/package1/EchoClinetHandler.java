package better_write.Netty_Book.decoder.package1;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/17
 * \* Time: 10:50
 * \* Description:
 * \
 */
public class EchoClinetHandler extends ChannelInboundHandlerAdapter {


    private int cnt;

    static final String ECHO_REQ = "hi,XXX,welcome to netty.$_";

    public EchoClinetHandler() {
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for (int i = 0; i < 10; i++) {

            ctx.writeAndFlush(Unpooled.copiedBuffer(ECHO_REQ.getBytes()));

        }
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("this is " + ++cnt + "times receive server : [ "
        + msg + "]");
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();;
        ctx.close();
    }
}
