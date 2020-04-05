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
 * \* Time: 20:22
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\f.txt");

        FileOutputStream outputStream = new FileOutputStream(file);

        w1(outputStream.getChannel());

    }

    private static void w1(FileChannel fileChannel) throws IOException {

        ByteBuffer buffer1 = ByteBuffer.wrap("abcde".getBytes());
        ByteBuffer buffer2 = ByteBuffer.wrap("12345".getBytes());

        buffer2.position(1);
        buffer2.limit(3);

        ByteBuffer buffer3 = ByteBuffer.wrap("dlelf1".getBytes());

        buffer3.position(2);
        buffer3.limit(4);

        ByteBuffer[] buffers = new ByteBuffer[]{
                buffer1,buffer2,buffer3
        };

        fileChannel.write(buffers,1,2);

        fileChannel.close();
    }
}
