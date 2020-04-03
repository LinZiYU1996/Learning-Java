package better_write.Java_NIO.learn_api.Buffer_api;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 17:48
 * \* Description:
 * \
 */
public class T9 {


    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3,4,5,6,7};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        byteBuffer.position(2);
        byteBuffer.limit(3);
        byteBuffer.mark();

        byteBuffer.clear();

        System.out.println("position: \n" + byteBuffer.position());

        System.out.println("");

        System.out.println("limit : \n" + byteBuffer.limit());

        System.out.println("");

    }
}
