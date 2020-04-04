package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 10:30
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {

        byte[] bs = {1,2,3,4,5,6,7,8};

        ByteBuffer b1 = ByteBuffer.wrap(bs);

        byte[] bs2 = {55,66,77};

        ByteBuffer b2 = ByteBuffer.wrap(bs2);

        b1.position(4);
        b2.position(1);

        b1.put(b2);

        System.out.println("b1改变 " +b1.position() + "\n");
        System.out.println("b2改变 " +b2.position() + "\n");

        byte[] out = b1.array();

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + "  ");
        }
    }


}
