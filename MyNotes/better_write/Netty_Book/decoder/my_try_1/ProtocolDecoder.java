package better_write.Netty_Book.decoder.my_try_1;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 15:17
 * \* Description:
 * \
 */
public class ProtocolDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

        System.out.println("decode");

        int length = byteBuf.readInt();

        String content = null;

        if (length > 0 ) {

            ByteBuf buf = byteBuf.readBytes(length);
            byte[] req = new byte[buf.readableBytes()];
            buf.readBytes(req);
            content = new String(req, "UTF-8");

        }


        MyProtocol myProtocol = new MyProtocol(length,content);

        list.add(myProtocol);

    }
}
