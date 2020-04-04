package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 9:59
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        byte[] bytes = {1,2,3,4,5,6,7,8,9};

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        int index = 0;

        while ( index < bytes.length) {

            int readLen = Math.min(
                    byteBuffer.remaining(),
                    bytes.length - index
            );

            byteBuffer.put(bytes,index,readLen);

            byteBuffer.flip();

            byte[] getB = byteBuffer.array();

            for (int i = 0; i < byteBuffer.limit(); i++) {
                System.out.print(getB[i] + "  ");
            }
            index = index + readLen;

            System.out.println("");

            byteBuffer.clear();

        }
    }
}
