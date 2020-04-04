package better_write.Java_NIO.learn_api.ByteBuffer_api.P3;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 19:37
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

//        test1();//-3

        test2();//-5



    }

    /*
    验证  如果开始与结束的范围之间有一个字节不一样  则返回两者的减数
     */
    private static void test1() {
        byte[] b1 = {3,4,5};
        byte[] b2 = {1,2,3,4,5,6,7,8};

        ByteBuffer buffer1 = ByteBuffer.wrap(b1);
        ByteBuffer buffer2 = ByteBuffer.wrap(b2);

        buffer1.position(0);
        buffer2.position(2);

        System.out.println(buffer1.compareTo(buffer2));
    }

    /*
    验证  如果开始与结束之间每个字节一样  则返回两者remaining的减数
     */
    private static  void test2() {

        byte[] b1 = {3,4,5};
        byte[] b2 = {1,2,3,4,5,6,7,8,9,10};

        ByteBuffer buffer1 = ByteBuffer.wrap(b1);
        ByteBuffer buffer2 = ByteBuffer.wrap(b2);

        buffer1.position(0);
        buffer2.position(2);

        System.out.println(buffer1.compareTo(buffer2));
    }
}
