package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 10:20
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test1() {

        byte[] bytes = {1,2,3,4,5};
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(bytes);
        buffer.put(2, (byte) 123);
        System.out.println(buffer.get(2));
        buffer.position(0);
        byte[] bytes1 = new byte[buffer.capacity()];
        buffer.get(bytes1,0,bytes1.length);
        for (int i = 0; i < bytes1.length; i++) {
            System.out.print(bytes1[i] + "  ");
        }
    }

    private static void test2() {

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        byteBuffer.position(9);

        System.out.println(byteBuffer.position());

        byteBuffer.put(2, (byte) 127);
        System.out.println(byteBuffer.position());

        byteBuffer.rewind();

        byte[] out = new byte[byteBuffer.capacity()];

        byteBuffer.get(out,0,out.length);

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + "  " );
        }
    }
}
