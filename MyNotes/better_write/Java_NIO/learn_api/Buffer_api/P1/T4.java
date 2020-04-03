package better_write.Java_NIO.learn_api.Buffer_api.P1;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 19:50
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3,4,5};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        byteBuffer.limit(3);

        byteBuffer.position(2);

        System.out.println("hasRemainging : \n"
        +byteBuffer.hasRemaining()
        +"Remainging : \n"
        +byteBuffer.remaining());


    }
}
