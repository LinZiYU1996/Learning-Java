package better_write.Netty_Book.decoder.package5;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 9:33
 * \* Description:
 * \
 */
public class MyProtocolDecoder extends LengthFieldBasedFrameDecoder {


    private static final int HEADER_SIZE = 6;

    public MyProtocolDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip, boolean failFast) {

        super(maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment, initialBytesToStrip, failFast);

    }

    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        //在这里调用父类的方法,实现指得到想要的部分,我在这里全部都要,也可以只要body部分
        in = (ByteBuf) super.decode(ctx,in);

        if(in == null){
            return null;
        }
        if(in.readableBytes()<HEADER_SIZE){
            throw new Exception("字节数不足");
        }
        //读取type字段
        byte type = in.readByte();
        //读取flag字段
        byte flag = in.readByte();
        //读取length字段
        int length = in.readInt();

        if(in.readableBytes()!=length){
            throw new Exception("标记的长度不符合实际长度");
        }
        //读取body
        byte []bytes = new byte[in.readableBytes()];
        in.readBytes(bytes);

        return new MyProtocolBean(type,flag,length,new String(bytes,"UTF-8"));
    }
}