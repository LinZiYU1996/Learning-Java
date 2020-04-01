package better_write.Java_IO.Blog.A8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 17:34
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\f.txt");

        InputStreamReader reader = new InputStreamReader(file);

        System.out.println(reader.getEncoding());//UTF8

        int data = 0;

        while ( (data = reader.read()) != -1) {

            System.out.println((char) data);
        }

        reader.close();
    }
}
