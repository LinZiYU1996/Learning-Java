package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 11:33
 * \* Description:
 * \
 */
public class T11 {

    public static void main(String[] args) {

        byte[] bytes = "abcdeff".getBytes();

        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        CharBuffer charBuffer = buffer.asCharBuffer();

        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get() + "     "    );

        }

        System.out.println("");
        buffer.put((byte) 2);

        buffer.put((byte) 45);

        charBuffer.clear();

        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get() + "     "    );
        }

    }
}
