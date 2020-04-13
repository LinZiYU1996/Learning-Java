package better_write.Learn_Netty.My.ByteBuf_api.P3;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 10:55
 * \* Description:
 * \
 */
public class DiscardHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //丢弃已接收的消息
        ReferenceCountUtil.release(msg);
    }
}
