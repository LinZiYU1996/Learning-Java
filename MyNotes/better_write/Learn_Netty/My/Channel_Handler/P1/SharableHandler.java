package better_write.Learn_Netty.My.Channel_Handler.P1;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 20:33
 * \* Description:
 * \
 */

@ChannelHandler.Sharable
public class SharableHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("channel read message :" + msg);
        //记录方法调用，并转发给下一个 ChannelHandler
        ctx.fireChannelRead(msg);
    }
}
