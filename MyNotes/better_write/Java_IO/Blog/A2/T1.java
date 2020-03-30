package better_write.Java_IO.Blog.A2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 19:34
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\c.txt");

        byte[] bytes = new byte[1024];

        int data = in.read(bytes);

        while (data != -1) {
//            System.out.println(data);
            data = in.read(bytes);
        }

        in.close();

    }
}
