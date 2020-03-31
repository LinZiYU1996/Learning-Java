package better_write.Java_IO.Blog.A3;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 10:19
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile accessFile = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\d.txt","r");

        byte[] bytes = new byte[1024];

        accessFile.readFully(bytes);

        accessFile.close();
    }
}
