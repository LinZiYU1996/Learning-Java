package better_write.Java_NIO.learn_api.FileChannel_api.P1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 10:39
 * \* Description:
 * \
 */
public class T2 {

    /*
    共享锁自己不能写  会出现异常
     */
    public static void main(String[] args) throws IOException {

        RandomAccessFile file1 = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\test\\c.txt","rw");

        FileChannel channel = file1.getChannel();

        channel.lock(1,2,true);

        channel.write(ByteBuffer.wrap("123456".getBytes()));
        /*
        Exception in thread "main" java.io.IOException: 另一个程序已锁定文件的一部分，进程无法访问。

         */

    }
}
