package better_write.Learn_Netty.My.ByteBuf_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 10:40
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {
        ByteBuf heapBuf = Unpooled.copiedBuffer("heap space",
                CharsetUtil.UTF_8);
        if (heapBuf.hasArray()) { //检查 ByteBuf 是否有一个支撑数组.当 hasArray()方法返回 false 时，
            // 尝试访问支撑数组将触发一个 UnsupportedOperationException。这个模式类似于 JDK 的 ByteBuffer 的用法
            byte[] array = heapBuf.array();
            int offset = heapBuf.arrayOffset() + heapBuf.readerIndex();
            int length = heapBuf.readableBytes();
            System.out.println(Arrays.toString(array));
            System.out.println(offset);
            System.out.println(length);
        } else {
            System.out.println("No Heap Array");
        }

    }
}
