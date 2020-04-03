package better_write.Java_NIO.learn_api.ByteBuffer_api.P1;

import java.nio.ByteBuffer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 20:23
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) {

//        t1();//973
//        t2();//1307

    }

    private static void t1(){
        long begin = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1000000000);
        for (int i = 0; i < 1000000000; i++) {
            byteBuffer.put((byte) 123);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    private static void t2(){
        long begin = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1000000000);
        for (int i = 0; i < 1000000000; i++) {
            byteBuffer.put((byte) 123);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
