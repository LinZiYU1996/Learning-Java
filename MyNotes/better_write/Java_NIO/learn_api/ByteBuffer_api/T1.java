package better_write.Java_NIO.learn_api.ByteBuffer_api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

        String path = "";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileChannel channel = fileInputStream.getChannel();






    }
}
