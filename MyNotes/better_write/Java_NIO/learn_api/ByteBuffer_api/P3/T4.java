package better_write.Java_NIO.learn_api.ByteBuffer_api.P3;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 19:49
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {

        byte[] bs = {1,2,3,4,5};
        ByteBuffer buffer = ByteBuffer.wrap(bs);
        ByteBuffer buffer12 = extendsSize(buffer,2);
        byte[] out = buffer12.array();
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + "  ");
        }

    }

    public static ByteBuffer extendsSize(ByteBuffer byteBuffer,int extendsSize) {
        ByteBuffer newbuffer = ByteBuffer.allocate(byteBuffer.capacity() + extendsSize);
        newbuffer.put(byteBuffer);
        return newbuffer;
    }


}


