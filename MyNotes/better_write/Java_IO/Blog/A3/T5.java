package better_write.Java_IO.Blog.A3;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 10:33
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile accessFile = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\f.txt","rw");

//        accessFile.write(122);
//
//        System.out.println("-------------");
//
//        accessFile.write("abcdfgh123".getBytes());
//
//        System.out.println("-------------");

//        accessFile.writeBoolean(true);

        accessFile.writeByte(121);

        accessFile.writeBytes("Hello world");

        accessFile.close();


    }
}
