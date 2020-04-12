package better_write.Learn_Netty.My.ByteBuf_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 11:57
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) {

        Charset utf8 = Charset.forName("UTF-8");

        ByteBuf buf = Unpooled.copiedBuffer("netty in action",utf8);

        //创建该ByteBuf 从索
        //引 0 开始到索引 15
        //结束的一个新切片
        ByteBuf sliced = buf.slice(0,15);

        System.out.println(sliced.toString(utf8));

        //更新索引 0 处的字节
        buf.setByte(0,(byte)'J');

        // 输出true 因为数据是共享的，对其中
        //一个所做的更改对另外一个也是可见的
        System.out.println(buf.getByte(0) == sliced.getByte(0));

    }
}
