package better_write.Java_NIO.learn_api.Buffer_api;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 17:33
 * \* Description:
 * \
 */
public class T8 {

    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(100);

        System.out.println(byteBuffer.isDirect());

        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(100);

        System.out.println(byteBuffer1.isDirect());

    }
}
