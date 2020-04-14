package better_write.Learn_Netty.My.Decoder_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/13
 * \* Time: 11:26
 * \* Description:
 * \
 */

//扩展ByteToMessage-Decoder 类，以将字节解码为特定的格式
public class ToIntegerDecoder extends ByteToMessageDecoder {


    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

        //检查是否至少有 4字节可读（一个 int的字节长度）
        if (byteBuf.readableBytes() >= 4) {
            //从入站 ByteBuf 中读取一个 int，并将其添加到解码消息的 List 中
            list.add(byteBuf.readInt());
        }
    }
}
