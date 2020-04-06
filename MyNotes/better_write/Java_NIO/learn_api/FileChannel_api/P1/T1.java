package better_write.Java_NIO.learn_api.FileChannel_api.P1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 10:17
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile file1 = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\c.txt","rw");
        RandomAccessFile file2 = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\d.txt","rw");

//        trans1(file1.getChannel(),file2.getChannel());

        trans2(file1.getChannel(),file2.getChannel());
    }

    private static void trans1(FileChannel channelA,FileChannel channelB) throws IOException {

        channelB.position(4);

        long readlen = channelA.transferFrom(channelB,100,2);

        System.out.println(readlen);

        channelA.close();
        channelB.close();
    }

    private static void trans2(FileChannel channelA,FileChannel channelB) throws IOException {
        channelB.position(4);

        long readlen = channelA.transferFrom(channelB,3,2);

        System.out.println(readlen);

        channelA.close();
        channelB.close();
    }

}
