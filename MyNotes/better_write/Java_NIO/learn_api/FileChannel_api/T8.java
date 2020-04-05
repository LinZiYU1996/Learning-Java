package better_write.Java_NIO.learn_api.FileChannel_api;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/4
 * \* Time: 20:40
 * \* Description:
 * \
 */
public class T8 {

    public static void main(String[] args) throws IOException {

//        trans1();

        trans2();


    }

    /*
    给定位置> 该文件的当前大小 不传输任何字节
     */

    private static void trans1() throws IOException {

        RandomAccessFile file1 = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\a.txt","rw");

        RandomAccessFile file2 = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\b.txt","rw");

        FileChannel channel1 = file1.getChannel();

        FileChannel channel2 = file1.getChannel();

        channel2.position(8);
        channel1.transferTo(1000,4,channel2);

        channel1.close();

        channel2.close();

        file1.close();
        file2.close();

    }

    private static void trans2() throws IOException {

        RandomAccessFile file1 = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\a.txt","rw");

        RandomAccessFile file2 = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\b.txt","rw");

        FileChannel channel1 = file1.getChannel();

        FileChannel channel2 = file1.getChannel();

        channel2.position(3);
        channel1.transferTo(2,3,channel2);

        channel1.close();

        channel2.close();

        file1.close();
        file2.close();

    }
}
