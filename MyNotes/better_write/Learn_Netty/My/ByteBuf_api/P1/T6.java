package better_write.Learn_Netty.My.ByteBuf_api.P1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/11
 * \* Time: 11:28
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) {

        ByteBuf buf = Unpooled.copiedBuffer("abcdefghijklmn".getBytes());

        int start_read = buf.readerIndex();

        int start_write = buf.writerIndex();

        System.out.println("capacity  " + buf.capacity());
        System.out.println("start_read   " + start_read);

        System.out.println("start_write " + start_write);

        for (int i = 0; i < buf.capacity(); i++) {
            System.out.print((char)buf.getByte(i));
        }

        System.out.println("");
        System.out.println("============================");
        buf.readBytes(5);

        int read = buf.readerIndex();

        buf.discardReadBytes();

        System.out.println("capacity  " + buf.capacity());


        System.out.println("read   " + read);

        for (int i = 0; i < buf.capacity(); i++) {
            System.out.print((char)buf.getByte(i));
        }
    }
}
