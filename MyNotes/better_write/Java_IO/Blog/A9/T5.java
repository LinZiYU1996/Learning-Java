package better_write.Java_IO.Blog.A9;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/1
 * \* Time: 10:27
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) throws IOException {

        String path = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\m.txt";

        FileReader reader = new FileReader(path);

        FileWriter writer = new FileWriter(path);

        writer.write("ni hao ao");

        int data = 0;

        while ((data = reader.read()) != -1) {

            System.out.println((char)data);
        }

        reader.close();
        writer.close();


    }
}
