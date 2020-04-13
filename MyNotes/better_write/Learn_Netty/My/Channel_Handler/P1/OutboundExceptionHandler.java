package better_write.Learn_Netty.My.Channel_Handler.P1;

import io.netty.channel.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 20:39
 * \* Description:
 * \
 */
public class OutboundExceptionHandler extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        promise.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (!channelFuture.isSuccess()) {
                    channelFuture.cause().printStackTrace();
                    channelFuture.channel().close();
                }
            }
        });
    }
}
