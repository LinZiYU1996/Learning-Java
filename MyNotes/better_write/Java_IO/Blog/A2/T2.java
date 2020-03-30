package better_write.Java_IO.Blog.A2;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 19:50
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream out = new FileOutputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\d.txt",true);

        String[] strings =
                {
                        "abcdefg",
                  "123456789",
                  "a124sjd"
                };

        for (String s : strings) {

            out.write("\n".getBytes());
            out.write(s.getBytes());
            out.write("\n".getBytes());

        }

        out.close();
    }
}
