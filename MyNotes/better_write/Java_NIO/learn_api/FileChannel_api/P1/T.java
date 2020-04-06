package better_write.Java_NIO.learn_api.FileChannel_api.P1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 10:26
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) throws IOException, InterruptedException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\c.txt","rw");

        lock1(randomAccessFile.getChannel());

        lock2(randomAccessFile.getChannel());


    }

    private static void lock1(FileChannel channel) throws InterruptedException, IOException {

        System.out.println("A begin \n");
        channel.lock(1,2,false);
        System.out.println("A end \n");
        Thread.sleep(9000);
        channel.close();
    }

    private static void lock2(FileChannel channel) throws InterruptedException, IOException {

        System.out.println("B begin \n");
        channel.lock(1,2,false);
        System.out.println("B end \n");
        Thread.sleep(8900);
        channel.close();
    }

}
