package better_write.Java_NIO.learn_api.ByteBuffer_api.P1;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 20:13
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        ByteBuffer byteBuffe2 = ByteBuffer.allocate(100);

        print(byteBuffer);
        System.out.println("-----------------------------------");
        print(byteBuffe2);

    }

    private static void print(Buffer buffer) {

        System.out.println("position : \n"
        + buffer.position()
        +"\n"
        +"limit : \n"
        +buffer.limit()
        +"\n"
        +buffer
        +"isDirect?\n"
        +buffer.isDirect());

    }
}
