package better_write.Java_NIO.learn_api.ByteBuffer_api.P1;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 20:35
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3,4,5,6,7,8,9};

        ByteBuffer b1 = ByteBuffer.wrap(bytes);
        ByteBuffer b2 = ByteBuffer.wrap(bytes,2,4);

        System.out.println("b1 capacity : \n"
        +b1.capacity()
        +"\n"
        +"b1 limit : \n"
        +b1.limit()
        +"\n"
                +"b1 position : \n"
                +b1.position());

        System.out.println("");

        System.out.println("b2 capacity : \n"
                +b2.capacity()
                +"\n"
                +"b2 limit : \n"
                +b2.limit()
                +"\n"
                +"b2 positon : \n"
                +b2.position());
    }
}
