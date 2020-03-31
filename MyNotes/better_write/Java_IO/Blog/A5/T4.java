package better_write.Java_IO.Blog.A5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 20:14
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws IOException {


        String path = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\t1.txt";

        FileOutputStream outputStream = new FileOutputStream(path,true);

        BufferedOutputStream out = new BufferedOutputStream(outputStream);

        out.write("where are you from".getBytes());

        out.close();

    }
}
