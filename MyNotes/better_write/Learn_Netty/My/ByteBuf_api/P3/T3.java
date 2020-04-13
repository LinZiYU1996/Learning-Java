package better_write.Learn_Netty.My.ByteBuf_api.P3;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 10:21
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {
        // 创建一个heapBuffer，是在堆内分配的

        ByteBuf buf = Unpooled.buffer(5);
        if (buf.hasArray()) {
            byte[] array = buf.array();
            int offset = buf.arrayOffset()+buf.readerIndex();
            int len = buf.readableBytes();
        }

        System.out.println("==============");

    }
}
