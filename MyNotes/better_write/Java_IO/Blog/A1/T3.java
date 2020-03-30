package better_write.Java_IO.Blog.A1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 17:47
 * \* Description:
 * \
 */
public class T3 {


    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\d.txt");

        for (int i = 0; i < 100; i++) {
            out.write(i);
        }
        out.close();
    }
}
