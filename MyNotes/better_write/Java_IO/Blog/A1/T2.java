package better_write.Java_IO.Blog.A1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 17:33
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\c.txt");

        byte[] bytes = new byte[1024];

        int data = in.read(bytes);

        StringBuilder sb = new StringBuilder();
        while (data != -1) {
//            System.out.println(data);
            for (byte b : bytes) {
                sb.append((char)b);
            }
            System.out.println(sb.toString());
            data = in.read(bytes);
        }

    }
}
