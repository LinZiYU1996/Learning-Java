package better_write.Java_IO.Blog.A5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 19:49
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        String s = "1234567890";
        out.write(60);
        out.write(s.getBytes());
        for (byte b : out.toByteArray()){
            System.out.println((char)b);
        }

        System.out.println(out.size());
    }
}
