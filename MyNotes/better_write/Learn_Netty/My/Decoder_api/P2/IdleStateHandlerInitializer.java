package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.CharsetUtil;

import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 9:37
 * \* Description:
 * \
 */
public class IdleStateHandlerInitializer extends ChannelInitializer<Channel> {


    @Override
    protected void initChannel(Channel channel) throws Exception {

        ChannelPipeline pipeline = channel.pipeline();

        pipeline.addLast(
                /*
                IdleStateHandler 将在被触发时发送一个IdleStateEvent事件
                 */
                new IdleStateHandler(0,0,60, TimeUnit.SECONDS)
        );

        /*
        将一个Heart-beatHandler添加到Chan-nelPipeline
         */
        pipeline.addLast(new HeartbeatHandler());
    }


    /*
    实现 userEvent-Triggered()方法以发送心跳消息
     */
    public static final class HeartbeatHandler
            extends ChannelInboundHandlerAdapter {
        /*
        发送到远程节点的心跳消息
         */
        private static final ByteBuf HEARTBEAT_SEQUENCE =
                Unpooled.unreleasableBuffer(Unpooled.copiedBuffer(
                        "HEARTBEAT", CharsetUtil.ISO_8859_1));
        @Override
        public void userEventTriggered(ChannelHandlerContext ctx,
                                       Object evt) throws Exception {
            /*
            发送心跳消息，并在发送失败时关闭该连接
             */
            if (evt instanceof IdleStateEvent) {
                ctx.writeAndFlush(HEARTBEAT_SEQUENCE.duplicate()).addListener(
                        ChannelFutureListener.CLOSE_ON_FAILURE);
            } else {
                /*
                不是 IdleStateEvent事件，所以将它传递给下一个 Channel-InboundHandler
                 */
                super.userEventTriggered(ctx, evt);
            }
        }
    }
}
