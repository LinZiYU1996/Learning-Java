package better_write.Java_NIO.learn_api.ByteBuffer_api;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/1
 * \* Time: 11:32
 * \* Description:
 * \
 */
public class T1{

    public static void main(String[] args) throws FileNotFoundException {

//        ByteBuffer byteBuffer = new ByteBuffer();

        FileChannel channel = new RandomAccessFile("test.txt", "rw").getChannel();


    }
}
