package better_write.Learn_Netty.My.ByteBuf_api.P3;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.util.ReferenceCountUtil;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 11:31
 * \* Description:
 * \
 */
public class DiscardOutboundHandler extends ChannelOutboundHandlerAdapter {


    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        //通过使用 ReferenceCountUtil.realse(...)方法释放资源
        ReferenceCountUtil.release(msg);
        //通知 ChannelPromise数据已经被处理了
        promise.setSuccess();
    }
}
