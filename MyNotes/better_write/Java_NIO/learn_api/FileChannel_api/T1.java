package better_write.Java_NIO.learn_api.FileChannel_api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 9:26
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        String path = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_NIO\\a.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        CharBuffer charBuffer = CharBuffer.allocate(1024);

        test_Write(fileInputStream,byteBuffer);

        test_Read(fileInputStream,byteBuffer,charBuffer);

    }


    private static void test_Read(FileInputStream inputStream, ByteBuffer byteBuffer, CharBuffer charBuffer) throws IOException {

        FileChannel read_channel = inputStream.getChannel();

        CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();

        byteBuffer.clear();

        while (read_channel.read(byteBuffer) != -1 || byteBuffer.position() > 0) {

            byteBuffer.flip();

            charBuffer.clear();

            decoder.decode(byteBuffer,charBuffer,false);

            System.out.println(charBuffer.flip().toString());

            byteBuffer.compact();
        }

        read_channel.close();

        System.out.println("");
        System.out.println("read done");

    }

    private static void test_Write(FileInputStream fileInputStream,ByteBuffer byteBuffer) throws IOException {

        FileChannel write_channel = fileInputStream.getChannel();

        byteBuffer.put("你好啊\n".getBytes(StandardCharsets.UTF_8));

        byteBuffer.flip();

        while ( byteBuffer.hasRemaining()) {
            write_channel.write(byteBuffer);
        }

        System.out.println("write done");
    }




}
