package better_write.Java_NIO.learn_api.FileChannel_api.P1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 10:45
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws IOException {

//        test1();//32

        test2();//6281
    }

    private static void test1() throws IOException {

        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\c.txt");

        FileOutputStream outputStream = new FileOutputStream(file);

        FileChannel channel = outputStream.getChannel();

        long begin = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            channel.write(ByteBuffer.wrap("abcde".getBytes()));
        }

        long end = System.currentTimeMillis();

        System.out.println(end - begin);

        channel.close();

    }

    private static void test2() throws IOException {

        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\c.txt");

        FileOutputStream outputStream = new FileOutputStream(file);

        FileChannel channel = outputStream.getChannel();

        long begin = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            channel.write(ByteBuffer.wrap("abcde".getBytes()));
            channel.force(false);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - begin);

        channel.close();

    }
}
