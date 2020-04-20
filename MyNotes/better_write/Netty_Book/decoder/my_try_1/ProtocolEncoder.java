package better_write.Netty_Book.decoder.my_try_1;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:15
 * \* Description:
 * \
 */
public class ProtocolEncoder extends MessageToByteEncoder<MyProtocol> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MyProtocol myProtocol, ByteBuf byteBuf) throws Exception {

        if (myProtocol == null) {
            throw new Exception("myProtocol is null");
        }

        byteBuf.writeInt(myProtocol.getLength());
        byteBuf.writeBytes(myProtocol.getContent().getBytes(Charset.forName("UTF-8")));

    }
}
