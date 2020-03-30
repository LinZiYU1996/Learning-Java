package better_write.Java_IO.Readers_and_Writers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 11:07
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\bb.txt");

        writer.write("123456789");

        writer.close();


    }
}
