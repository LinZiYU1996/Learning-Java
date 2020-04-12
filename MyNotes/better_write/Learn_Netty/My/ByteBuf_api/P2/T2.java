package better_write.Learn_Netty.My.ByteBuf_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 22:12
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        Charset utf8 = Charset.forName("UTF-8");
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);

        //创建该ByteBuf 从索
        //引 0 开始到索引 15
        //结束的分段的副本
        ByteBuf copy = buf.copy(0, 15);
        System.out.println(copy.toString(utf8));

        //更新索引 0 处的字节
        buf.setByte(0, (byte) 'J');

        //输出true 数据不是共享的
        System.out.println(buf.getByte(0) != copy.getByte(0));

    }
}
