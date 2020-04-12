package better_write.Learn_Netty.My.ByteBuf_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 22:30
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {
        Charset utf8 = Charset.forName("UTF-8");
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);

        System.out.println((char)buf.readByte());

        int readerIndex = buf.readerIndex();

        int writerIndex = buf.writerIndex();

        //将字符'?'追加
        //到缓冲区
        buf.writeByte((byte)'?');

        // true
        System.out.println(readerIndex == buf.readerIndex());

        // false 因为 writeByte()
        //方法移动了 writerIndex
        System.out.println(writerIndex == buf.writerIndex());
    }
}
