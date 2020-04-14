package better_write.Learn_Netty.My.Decoder_api.P1;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/13
 * \* Time: 12:00
 * \* Description:
 * \
 */
public class IntegerToStringEncoder extends MessageToMessageEncoder<Integer> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Integer integer, List<Object> list) throws Exception {

        list.add(String.valueOf(integer));
    }
}
