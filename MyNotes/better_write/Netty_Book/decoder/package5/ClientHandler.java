package better_write.Netty_Book.decoder.package5;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 9:37
 * \* Description:
 * \
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        MyProtocolBean myProtocolBean = new MyProtocolBean((byte)0xA, (byte)0xC, "Hello,Netty".length(), "Hello,Netty");
        ctx.writeAndFlush(myProtocolBean);

    }


}
