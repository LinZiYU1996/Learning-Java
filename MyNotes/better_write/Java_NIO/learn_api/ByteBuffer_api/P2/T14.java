package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 19:17
 * \* Description:
 * \
 */
public class T14 {

    public static void main(String[] args) {

        ByteBuffer buffer1 = ByteBuffer.wrap(new byte[]{1,2,34,5,6});

        System.out.println("capacity : \n"
        + buffer1.capacity()
        +"\n"
        +"position: \b"
        +buffer1.position()
        +"\n"
        +"limit : \n"
        +buffer1.limit());

        System.out.println("------------------------------");

        System.out.println("getval : \n" + buffer1.get());

        System.out.println("------------------------------");

        System.out.println("capacity : \n"
                + buffer1.capacity()
                +"\n"
                +"position: \b"
                +buffer1.position()
                +"\n"
                +"limit : \n"
                +buffer1.limit());

        System.out.println("------------------------------");

        System.out.println("getVal : \n" + buffer1.get());

        System.out.println("------------------------------");

        buffer1.compact();

        System.out.println("compact");

        System.out.println("capacity : \n"
                + buffer1.capacity()
                +"\n"
                +"position: \b"
                +buffer1.position()
                +"\n"
                +"limit : \n"
                +buffer1.limit());

        byte[] out = buffer1.array();

        for (int i = 0; i < out.length ; i++) {
            System.out.print(out[i] + "  ");
        }



    }
}
