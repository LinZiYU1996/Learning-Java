package better_write.Java_IO.Blog.A6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 20:56
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) throws IOException {


        String path1 = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\t1.txt";

        String path2 = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\t2.txt";

        FileInputStream f1 = new FileInputStream(path1);

        FileInputStream f2 = new FileInputStream(path2);

        SequenceInputStream in = new SequenceInputStream(f1,f2);

        int data = 0;

        while ((data = in.read()) != -1) {

            System.out.println((char) data);

        }

        in.close();

    }
}
