package better_write.Java_IO.Blog.A3;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 10:28
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile accessFile = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\d.txt","r");

        System.out.println(accessFile.readBoolean());

        System.out.println(accessFile.readByte());

        System.out.println(accessFile.readUnsignedByte());

        System.out.println(accessFile.readShort());

        System.out.println(accessFile.readLine());
    }
}
