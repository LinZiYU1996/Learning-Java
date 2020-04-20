package better_write.Netty_Book.life.package1;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 18:03
 * \* Description:
 * \
 */
public class ClientLiHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        String s = "abc";

        ctx.writeAndFlush(Unpooled.copiedBuffer(s.getBytes()));


    }
}
