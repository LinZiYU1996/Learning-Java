package better_write.Netty_Book.decoder.package6;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 11:33
 * \* Description:
 * \
 */
public class RcpClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        String body = "this message is from client";
        ctx.writeAndFlush(new RequestParam((byte) 1, (byte) 2, body.length(), body));
    }
}
