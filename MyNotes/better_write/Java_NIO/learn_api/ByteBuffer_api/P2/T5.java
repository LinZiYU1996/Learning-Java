package better_write.Java_NIO.learn_api.ByteBuffer_api.P2;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 10:40
 * \* Description:
 * \
 */
public class T5 {


    public static void main(String[] args) {

        ByteBuffer b1 = ByteBuffer.allocate(100);
        b1.putChar('a'); // 0 - 1 char 占两个字节

        b1.putChar(2,'b'); // 2-3

        b1.position(4);

        b1.putDouble(1.1);// 4 - 11 double 占8个字节

        b1.putDouble(12,1.2);//12 - 19

        b1.position(20);
        b1.putFloat(2.1F);//20 - 23 float占4个字节
        b1.putFloat(24,2.6F);

        b1.position(28);
        b1.putInt(25);// 28-31 int 4 个字节
        b1.putInt(32,32);//32-35

        b1.position(36);
        b1.putLong(41L);//36-43 long 8 字节
        b1.putLong(44,45L);

        b1.position(52);
        b1.putShort((short) 51);// 52 -53 short 2 字节
        b1.putShort(54, (short) 56);// 54 -55


        b1.position(0);

        byte[] out = b1.array();

        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + "  ");
        }

        System.out.println("");

        System.out.println(b1.getChar());
        System.out.println(b1.getChar(2));

    }
}
