package better_write.Learn_Netty.My.ByteBuf_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 22:21
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {

        Charset utf8 = Charset.forName("UTF-8");
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);

        //打印第一
        //个字符'N'
        System.out.println((char)buf.getByte(0));

        int readerIndex = buf.readerIndex();

        int writerIndex = buf.writerIndex();

        //将索引 0 处的字
        //节更新为字符'B'
        buf.setByte(0,(byte)'B');

        System.out.println((char)buf.getByte(0));

        // true 因为这些操作
        //并不会修改相应的索引
        System.out.println(readerIndex == buf.readerIndex());

        System.out.println(writerIndex == buf.writerIndex());


    }
}
