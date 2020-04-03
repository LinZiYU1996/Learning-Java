package better_write.Java_NIO.learn_api.Buffer_api.P1;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 19:59
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3,4,5,6,7,8};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        print(byteBuffer);

        System.out.println("");

        byteBuffer.position(1);
        byteBuffer.limit(3);
        byteBuffer.mark();

        print(byteBuffer);

        System.out.println("");

        byteBuffer.rewind();

        print(byteBuffer);

        byteBuffer.reset();


    }
    private static void print(Buffer buffer){
        System.out.println("capacity : \n"
                + buffer.capacity()
                +"\n"
                +"limit : \n"
                +buffer.limit()
        +"\n"
        +"position : \n"
        + buffer.position());
    }
}

