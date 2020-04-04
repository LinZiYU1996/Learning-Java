package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 10:05
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3,4,5};

        ByteBuffer byteBuffer = ByteBuffer.allocate(10);

        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 2);

        System.out.println("position : \n" + byteBuffer.position() + "\n");

        byteBuffer.put(bytes);

        System.out.println("position : \n" + byteBuffer.position() + "\n");

        byteBuffer.flip();

        byteBuffer.position(3);

        System.out.println("position : \n" + byteBuffer.position() + "\n");
        byte[] newB= new byte[byteBuffer.remaining()];

        byteBuffer.get(newB);

        for (int i = 0; i < newB.length; i++) {
            System.out.print(newB[i] + "  ");

        }
    }
}
