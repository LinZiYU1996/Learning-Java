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
 * \* Time: 20:34
 * \* Description:
 * \
 */
public class T7 {

    public static void main(String[] args) throws IOException {

        ByteBuffer buffer1 = ByteBuffer.wrap("12345678".getBytes());

        FileOutputStream outputStream = new FileOutputStream(new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\aa.txt"));

        FileChannel channel = outputStream.getChannel();

        channel.write(buffer1);

        System.out.println("size    position");

        System.out.println(channel.size() + "     "   +channel.position());

        channel.truncate(3);

        System.out.println("");

        System.out.println("size    position");

        System.out.println(channel.size() + "     "   +channel.position());

        channel.close();

        outputStream.flush();

        outputStream.close();

    }
}
