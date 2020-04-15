package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 10:14
 * \* Description:
 * \
 */
public class LengthBasedInitializer extends ChannelInitializer<Channel> {


    @Override
    protected void initChannel(Channel channel) throws Exception {

        ChannelPipeline pipeline = channel.pipeline();

        /*
        使用 LengthFieldBasedFrameDecoder 解码将帧长度编码到帧起始的前 8 个字节中的消息
         */
        pipeline.addLast(
                new LengthFieldBasedFrameDecoder(64 * 1024, 0, 8));

        /*
        添加 FrameHandler以处理每个帧
         */
        pipeline.addLast(new FrameHandler());

    }

    public static final class FrameHandler
            extends SimpleChannelInboundHandler<ByteBuf> {
        @Override
        public void channelRead0(ChannelHandlerContext ctx,
                                 ByteBuf msg) throws Exception {
// Do something with the frame
        }
    }
}
