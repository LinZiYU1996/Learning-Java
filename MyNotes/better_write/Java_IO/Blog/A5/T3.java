package better_write.Java_IO.Blog.A5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 20:00
 * \* Description:
 * \
 */
public class T3 {


    public static void main(String[] args) throws IOException {

        String path = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\c.txt";

        FileInputStream inputStream = new FileInputStream(path);

        BufferedInputStream in = new BufferedInputStream(inputStream);

        int data = in.read();

        while (data != -1) {

            System.out.println(data);

            data = in.read();
        }
        in.close();
    }
}
