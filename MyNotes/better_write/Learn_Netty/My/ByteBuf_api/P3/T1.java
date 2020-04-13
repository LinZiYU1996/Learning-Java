package better_write.Learn_Netty.My.ByteBuf_api.P3;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 9:36
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        ByteBuffer header = ByteBuffer.allocate(1);
        header.put("a".getBytes());
        header.flip();
        ByteBuffer body = ByteBuffer.allocate(1);
        body.put("b".getBytes());
        body.flip();
        /*
        为了得到完整的消息体相当于对内存进行了多余的两次拷贝，造成了很大的资源的浪费。
         */
        ByteBuffer msg = ByteBuffer.allocate(header.remaining()+body.remaining());
        msg.put(header);
        msg.put(body);
        msg.flip();
        while (msg.hasRemaining()) {
            System.out.println((char)msg.get());
        }

        System.out.println("==================================");

        CompositeByteBuf com_msg = Unpooled.compositeBuffer();
        ByteBuf header1 = Unpooled.buffer(1);
        header1.writeByte('a');
        ByteBuf body1 = Unpooled.buffer(1);
        body1.writeByte('b');
        /*
        这里通过CompositeByteBuf 对象将headerBuf 与bodyBuf组合到了一起，也得到了完整的消息体，但是并未进行内存上的拷贝。
        可以注意代码段中进行的buf.toString()方法的调用，得出来的结果是:指向的还是原来分配的空间地址，也就证明了零拷贝的观点
         */
        com_msg.addComponents(header1,body1);
        for (ByteBuf buf : com_msg) {
            System.out.println((char)buf.readByte());
            System.out.println(buf.toString());
        }
    }
}
/*
a
UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf(ridx: 1, widx: 1, cap: 1)
b
UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf(ridx: 1, widx: 1, cap: 1)
 */