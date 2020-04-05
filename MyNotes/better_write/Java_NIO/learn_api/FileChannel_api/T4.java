package better_write.Java_NIO.learn_api.FileChannel_api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/4
 * \* Time: 20:12
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\e.txt");

        FileOutputStream outputStream = new FileOutputStream(file);

//        w1(outputStream.getChannel());


        w2(outputStream.getChannel());


    }

    /*
        验证 long write​(ByteBuffer[] srcs) 方法是从通道的当前位置开始写入的
     */

    private static void w1(FileChannel fileChannel) throws IOException {

        fileChannel.write(ByteBuffer.wrap("123456".getBytes()));
        fileChannel.position(3);

        ByteBuffer b1 = ByteBuffer.wrap("ooooo1".getBytes());
        ByteBuffer b2 = ByteBuffer.wrap("ooooo2".getBytes());
        ByteBuffer[] byteBuffers = new ByteBuffer[]{b1,b2};

        fileChannel.write(byteBuffers);

        fileChannel.close();
    }

    /*
     验证 long write​(ByteBuffer[] srcs)  方法将缓冲区的remaining写入通道
     */
    private static void w2(FileChannel fileChannel) throws IOException {

        fileChannel.write(ByteBuffer.wrap("123456".getBytes()));
        fileChannel.position(3);

        ByteBuffer b1 = ByteBuffer.wrap("abcde1".getBytes());
        ByteBuffer b2 = ByteBuffer.wrap("uvwxy2".getBytes());

        ByteBuffer[] byteBuffers = new ByteBuffer[]{b1,b2};

        b1.position(1);
        b1.limit(3);

        b2.position(2);
        b2.limit(4);

        fileChannel.write(byteBuffers);

        fileChannel.close();

    }
}
