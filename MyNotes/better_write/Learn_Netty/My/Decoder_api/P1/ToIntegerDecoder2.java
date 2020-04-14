package better_write.Learn_Netty.My.Decoder_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/13
 * \* Time: 11:39
 * \* Description:
 * \
 */

//扩展 Replaying-Decoder<Void>以将字节解码为消息
public class ToIntegerDecoder2 extends ReplayingDecoder<Void> {

    //传入的 ByteBuf 是ReplayingDecoderByteBuf
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        //从入站 ByteBuf 中读取一个 int，并将其添加到解码消息的 List 中
        list.add(byteBuf.readInt());
    }
}
