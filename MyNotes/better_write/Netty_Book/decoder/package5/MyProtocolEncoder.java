package better_write.Netty_Book.decoder.package5;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 9:37
 * \* Description:
 * \
 */
public class MyProtocolEncoder extends MessageToByteEncoder<MyProtocolBean> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MyProtocolBean myProtocolBean, ByteBuf out) throws Exception {
        if(myProtocolBean == null){
            throw new Exception("msg is null");
        }
        out.writeByte(myProtocolBean.getType());
        out.writeByte(myProtocolBean.getFlag());
        out.writeInt(myProtocolBean.getLength());
        out.writeBytes(myProtocolBean.getContent().getBytes(Charset.forName("UTF-8")));
    }
}
