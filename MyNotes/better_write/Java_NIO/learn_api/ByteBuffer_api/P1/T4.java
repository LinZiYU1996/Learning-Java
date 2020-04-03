package better_write.Java_NIO.learn_api.ByteBuffer_api.P1;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 20:55
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {

        ByteBuffer b1 = ByteBuffer.allocate(10);
        print(b1,"初始");

        System.out.println("");

        b1.put((byte) 225);
        print(b1,"put之后");

        System.out.println("");

        b1.put((byte) 127);
        print(b1,"再次put之后");

        b1.rewind();

        print(b1,"rewind之后");

        System.out.println("");

        System.out.println(b1.get());

        print(b1,"get 之后");

        System.out.println("");

        System.out.println(b1.get());

        System.out.println("");

        print(b1,"再次get之后");


    }

    private static void print(Buffer buffer,String name) {
        System.out.println(name
        +"\n"
        +"capacity : \n"
        +buffer.capacity()
        +"\n"
        +"limit : \n"
        +buffer.limit()
        +"\n"
        +"position : \n"
        +buffer.position());
    }
}
