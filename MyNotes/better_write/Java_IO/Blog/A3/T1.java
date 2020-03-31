package better_write.Java_IO.Blog.A3;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 9:49
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        RandomAccessFile accessFile = new RandomAccessFile("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\d.txt","r");

        int data = accessFile.read();

        while (data != -1) {

//            System.out.println((char) data);

            data = accessFile.read();

        }

        accessFile.close();


    }


}
