package better_write.Java_IO.Blog.A1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 17:51
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\d.txt");

        String[] strings = {"djdjdjs","5645","sjdjjd"};

        for (String s : strings) {

            out.write(s.getBytes());
        }

        out.close();

    }
}
