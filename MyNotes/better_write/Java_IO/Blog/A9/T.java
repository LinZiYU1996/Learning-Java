package better_write.Java_IO.Blog.A9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/1
 * \* Time: 9:49
 * \* Description:
 * \
 */
public class T {


    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\m.txt");

        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write(100);

        writer.write("Hello John");

        writer.newLine();

        writer.write("4545");
        writer.close();

    }
}
