package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 18:06
 * \* Description:
 * \
 */
public class T13 {

    public static void main(String[] args) {

        byte[] bs = {1,2,3,4,5,6,7,8};

        ByteBuffer buffer1 = ByteBuffer.wrap(bs);
        ByteBuffer read_buffer = buffer1.asReadOnlyBuffer();

        System.out.println("is readOnly \n"
        + buffer1.isReadOnly());

        System.out.println("is readOnly \n"
                + read_buffer.isReadOnly());

        read_buffer.rewind();

        read_buffer.put((byte) 123);

    }
}
