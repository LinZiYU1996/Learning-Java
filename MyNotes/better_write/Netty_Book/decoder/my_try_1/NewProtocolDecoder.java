package better_write.Netty_Book.decoder.my_try_1;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 17:00
 * \* Description:
 * \
 */
public class NewProtocolDecoder extends LengthFieldBasedFrameDecoder {


    public NewProtocolDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip){

        super(maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment, initialBytesToStrip);


    }


    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {

        System.out.println("decode");
        in  = (ByteBuf) super.decode(ctx, in);

        int length = in.readInt();

        byte []bytes = new byte[in.readableBytes()];
        in.readBytes(bytes);

        in.resetReaderIndex();

        return new MyProtocol(length,new String(bytes,"UTF-8"));



    }
}
