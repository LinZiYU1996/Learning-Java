package better_write.Java_IO.Blog.A5;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 19:38
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        String s = "abcdefghijlmnopq";

        ByteArrayInputStream in = new ByteArrayInputStream(s.getBytes());

        in.skip(5);

        int data = in.read();

        while (data != -1) {

            System.out.println((char) data);
            data = in.read();
        }

        in.close();

    }
}
