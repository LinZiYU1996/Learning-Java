package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 10:55
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) {

        byte[] bytes1 = {1,2,3,4,5,6,7,8};

        ByteBuffer buffer1 = ByteBuffer.wrap(bytes1);

        buffer1.position(5);

        ByteBuffer buffer2 = buffer1.slice();

        System.out.println("bu1 position = "
        + buffer1.position()
        +"\n"
        +"bu1 capacity "
        +buffer1.capacity()
        +"\n"
        +"bu1 limit "
        + buffer1.limit());

        System.out.println("---------------------------------");

        System.out.println("bu2 position = "
                + buffer2.position()
                +"\n"
                +"bu2 capacity "
                +buffer2.capacity()
                +"\n"
                +"bu2 limit "
                + buffer2.limit());

        System.out.println("");


        buffer2.put(0, (byte) 11);

        byte[] bs1 = buffer1.array();

        byte[] bs2 = buffer2.array();

        for (int i = 0; i < bs1.length; i++) {
            System.out.print(bs1[i] + "  ");
        }

        System.out.println("");

        for (int i = 0; i < bs2.length; i++) {
            System.out.print(bs2[i] + "  ");
        }



    }
}
