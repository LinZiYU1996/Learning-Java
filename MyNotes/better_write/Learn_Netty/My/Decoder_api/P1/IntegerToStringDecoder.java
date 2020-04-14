package better_write.Learn_Netty.My.Decoder_api.P1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/13
 * \* Time: 11:49
 * \* Description:
 * \
 */

//扩展了MessageToMessageDecoder<Integer>
public class IntegerToStringDecoder extends MessageToMessageDecoder<Integer> {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, Integer integer, List<Object> list) throws Exception {

        //将 Integer 消息转换为它的 String 表示，并将其添加到输出的 List 中
        list.add(String.valueOf(integer));
    }


}
