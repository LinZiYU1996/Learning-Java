package better_write.Learn_Netty.My.Decoder_api.P3;

import io.netty.channel.*;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 10:33
 * \* Description:
 * \
 */
public class ProtoBufInitializer extends ChannelInitializer<Channel> {

//    private final MessageLite lite;
//    public ProtoBufInitializer(MessageLite lite) {
//        this.lite = lite;
//    }

    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new ProtobufVarint32FrameDecoder());
        pipeline.addLast(new ProtobufEncoder());
//        pipeline.addLast(new ProtobufDecoder(lite));
        pipeline.addLast(new ObjectHandler());
    }

    public static final class ObjectHandler
            extends SimpleChannelInboundHandler<Object> {
        @Override
        public void channelRead0(ChannelHandlerContext ctx, Object msg)
                throws Exception {
// Do something with the object
        }
    }
}


