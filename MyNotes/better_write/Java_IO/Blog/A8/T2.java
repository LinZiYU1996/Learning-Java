package better_write.Java_IO.Blog.A8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 20:42
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\f.txt");

        OutputStreamWriter writer = new OutputStreamWriter(file);

        writer.write(10);

        writer.write("where are you from");

        writer.close();


    }
}
