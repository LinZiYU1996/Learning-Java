package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 17:59
 * \* Description:
 * \
 */
public class T12 {

    public static void main(String[] args) {

        int val = 123456789;

        ByteBuffer buffer1 = ByteBuffer.allocate(4);

        System.out.println(buffer1.order() + "  ");

        System.out.println(buffer1.order() + "  " );

        buffer1.putInt(val);

        byte[] bs = buffer1.array();

        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i] + "  ");
        }

        System.out.println("");

        buffer1 = ByteBuffer.allocate(4);

        System.out.println(buffer1.order() + "  ");

        buffer1.order(ByteOrder.BIG_ENDIAN);

        System.out.println(buffer1.order() + " ");

        buffer1.putInt(val);

        bs = buffer1.array();

        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i] + "  ");
        }

        System.out.println("");

        buffer1 = ByteBuffer.allocate(4);

        System.out.println(buffer1.order() + "  ");

        buffer1.order(ByteOrder.LITTLE_ENDIAN);

        System.out.println(buffer1.order() + " ");

        buffer1.putInt(val);

        bs = buffer1.array();

        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i] + " ");
        }
    }
}
