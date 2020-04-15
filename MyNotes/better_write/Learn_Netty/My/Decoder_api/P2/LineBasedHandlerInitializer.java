package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.handler.codec.LineBasedFrameDecoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 10:03
 * \* Description:
 * \
 */
public class LineBasedHandlerInitializer extends ChannelInitializer<Channel> {


    @Override
    protected void initChannel(Channel channel) throws Exception {

        ChannelPipeline pipeline = channel.pipeline();

        /*
        该 LineBasedFrame-Decoder将提取的帧转发给下一个 Channel-InboundHandler
         */
        pipeline.addLast(new LineBasedFrameDecoder(64 * 1024));

        /*
        添加 FrameHandler以接收帧
         */
        pipeline.addLast(new FrameHandler());

    }

    public static final class FrameHandler
            extends SimpleChannelInboundHandler<ByteBuf> {
        /*
        传入了单个帧的内容
         */
        @Override
        public void channelRead0(ChannelHandlerContext ctx,
                                 ByteBuf msg) throws Exception {
// Do something with the data extracted from the frame
        }
    }
}
