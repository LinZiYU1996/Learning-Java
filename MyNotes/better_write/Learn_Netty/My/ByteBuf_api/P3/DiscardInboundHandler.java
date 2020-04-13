package better_write.Learn_Netty.My.ByteBuf_api.P3;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 11:29
 * \* Description:
 * \
 */
public class DiscardInboundHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //通过调用 ReferenceCountUtil.release()法释放资源
        ReferenceCountUtil.release(msg);
    }
}
