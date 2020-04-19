package better_write.Netty_Book.decoder.package6;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 10:46
 * \* Description:
 * \
 */
public class RequestEncoder extends MessageToByteEncoder<RequestParam> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, RequestParam requestParam, ByteBuf out) throws Exception {
        if( requestParam == null){
            throw new Exception("request param null");
        }
        out.writeByte(requestParam.getType());
        out.writeByte(requestParam.getFlag());
        out.writeInt(requestParam.getLength());
        out.writeBytes(requestParam.getBody().getBytes());

    }
}
