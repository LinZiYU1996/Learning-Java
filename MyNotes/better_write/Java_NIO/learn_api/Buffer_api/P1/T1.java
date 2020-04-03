package better_write.Java_NIO.learn_api.Buffer_api.P1;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 18:07
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        byteBuffer.position(2);
        byteBuffer.mark();

        byteBuffer.flip();

        System.out.println("position : \n" + byteBuffer.position());
        System.out.println("---------------");

        System.out.println("limit : \n" + byteBuffer.limit());
        System.out.println("---------------");

        try {
            byteBuffer.reset();
        } catch (InvalidMarkException e) {
            System.out.println("mark discard");
        }

    }
}
