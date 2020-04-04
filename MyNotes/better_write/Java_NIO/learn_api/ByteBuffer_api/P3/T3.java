package better_write.Java_NIO.learn_api.ByteBuffer_api.P3;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 19:43
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {

        byte[] bs = {1,2,3,4,5};
        ByteBuffer buffer1 = ByteBuffer.wrap(bs);
        buffer1.position(2);

        System.out.println("  1   catacity   limit    position \n");
        System.out.println(buffer1.capacity()+"    " + buffer1.limit()+"   "
        +buffer1.position());

        System.out.println("");

        ByteBuffer buffer2 = buffer1.slice();
        ByteBuffer buffer3 = buffer1.duplicate();

        ByteBuffer buffer4 = buffer1;

        System.out.println("2   catacity   limit    position \n");
        System.out.println(buffer2.capacity()+"    " + buffer2.limit()+"   "
                +buffer2.position());

        System.out.println("");


        System.out.println("3   catacity   limit    position \n");
        System.out.println(buffer3.capacity()+"    " + buffer3.limit()+"   "
                +buffer3.position());

        System.out.println("");

        buffer2.position(0);

        for (int i = buffer2.position(); i < buffer2.limit(); i++) {
            System.out.print(buffer2.getChar(i) + "  ");
        }

        System.out.println("");

        buffer3.position(3);

        for (int i = buffer3.position(); i < buffer3.limit(); i++) {
            System.out.print(buffer3.getChar(i) + "  ");
        }

    }
}
