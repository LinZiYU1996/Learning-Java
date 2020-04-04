package better_write.Java_NIO.learn_api.ByteBuffer_api.P3;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/3
 * \* Time: 19:25
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

//        test1();
//        test2();
//        test3();
        test4();
    }

/*
判断是不是自身，如果是 返回true
 */
    private static void test2() {
        byte[] bs = {1,2,3,4,5};
        ByteBuffer buffer = ByteBuffer.wrap(bs);

        System.out.println(buffer.equals(buffer));

    }

    /*
    验证是不是ByteBuffer类的实例 不是返回false
     */
    private static void test1() {

        byte[] bs = {1,2,3,4,5};
        int[] ints = {1,2,3,4,5};

        ByteBuffer buffer1 = ByteBuffer.wrap(bs);
        IntBuffer buffer2 = IntBuffer.wrap(ints);

        System.out.println(buffer1.equals(buffer2));

    }


    /*
    判断remainging是否一样 不一样返回false
     */
    private static void test3() {
        byte[] b1 = {3,4,5};
        byte[] b2 = {1,2,3,4,5,6,7,8};

        ByteBuffer buffer1 = ByteBuffer.wrap(b1);
        ByteBuffer buffer2 = ByteBuffer.wrap(b2);

        buffer1.position(0);
        buffer2.position(3);

        System.out.println(buffer1.equals(buffer2));
        System.out.println("");
        System.out.println(buffer1.remaining());
        System.out.println(buffer2.remaining());

    }

    /*
    验证 判断两个缓冲区中的 position以及limit之间的数据是否完全一样
    只要有一个字节不一样  就返回false
     */
    private static void test4() {

        byte[] b1 = {3,4,5};
        byte[] b2 = {1,2,3,4,5,6,7,8};

        ByteBuffer buffer1 = ByteBuffer.wrap(b1);
        ByteBuffer buffer2 = ByteBuffer.wrap(b2);

        buffer1.position(0);
        buffer1.limit(3);
        buffer2.position(2);
        buffer2.limit(5);

        System.out.println(buffer1.equals(buffer2));

        System.out.println("");

        System.out.println(buffer1.remaining());
        System.out.println(buffer2.remaining());

        System.out.println("");

        buffer2.put(3, (byte) 44);

        System.out.println("");

        System.out.println(buffer1.equals(buffer2));


        System.out.println(buffer1.remaining());
        System.out.println(buffer2.remaining());
    }

}
