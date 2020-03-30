package better_write.Java_IO.Readers_and_Writers;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 11:00
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {


        Reader reader = new FileReader("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\bb.txt");

        int data = reader.read();

        while ( data != -1) {

            System.out.println((char)data);

            data = reader.read();
        }

    }
}
