package better_write.Learn_Netty.My.ByteBuf_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 11:17
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) {

        ByteBuf b = Unpooled.buffer(8);

        int start_write_index = b.writerIndex();

        System.out.println("start_write_index  " + start_write_index);

        int start_read_index = b.readerIndex();

        System.out.println("start_read_index  " + start_read_index);

        System.out.println(" capacity " + b.capacity());

        System.err.println("========================");

        for (int i = 0; i < 3; i++) {
            b.writeByte(i);
        }

        int write_index = b.writerIndex();

        System.out.println(" write_index " + write_index);
        b.readBytes(2);

        int read_index = b.readerIndex();

        System.out.println(" read_index " + read_index);

        System.out.println(" capacity " + b.capacity());

    }
}
