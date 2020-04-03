package better_write.Java_NIO.learn_api.Buffer_api.P1;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 18:21
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(100);

        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 2);

        System.out.println(byteBuffer.hasArray());

        /* 对直接缓冲区判断 */

        ByteBuffer dircet_byteBuffer = ByteBuffer.allocateDirect(100);
        dircet_byteBuffer.put((byte) 1);
        dircet_byteBuffer.put((byte) 2);
        System.out.println(dircet_byteBuffer.hasArray());

    }
}
