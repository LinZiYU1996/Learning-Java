package better_write.Java_NIO.learn_api.ByteBuffer_api.P1;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 21:09
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) {

        byte[] bytes = {1,2,3,4,5,6,7,8,9};
        byte[] bytes2 = {11,22,33,44,55,66,77};

        ByteBuffer b1 = ByteBuffer.allocate(10);
        b1.put(bytes);
        System.out.println(b1.position());
        b1.position(2);

        b1.put(bytes2,1,3);

        System.out.println("A");
        byte[] getB = b1.array();
        for (int i = 0; i < getB.length ; i++) {
            System.out.print(getB[i] + "  ");
        }
        System.out.println("");
        System.out.println(b1.position());
        System.out.println("");
        b1.position(1);
        byte[] out = new byte[b1.capacity()];
        b1.get(out,3,4);
        System.out.println("B");
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + "   ");
        }
    }
}
