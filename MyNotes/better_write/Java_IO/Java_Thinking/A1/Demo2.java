package better_write.Java_IO.Java_Thinking.A1;

import java.io.IOException;
import java.io.StringReader;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:30
 * \* Description:
 * \
 */
public class Demo2 {


    public static void main(String[] args) throws IOException {

        StringReader in = new StringReader(
                Demo1.read("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\Java_Thinking\\A1\\Demo1.java")
        );

        int c;

        while ((c = in.read()) != -1) {
            System.out.println((char) c);
        }

    }
}
