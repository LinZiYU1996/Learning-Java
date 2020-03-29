package better_write.Java_IO.Java_Thinking.A1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:26
 * \* Description:
 * \
 */
public class Demo1 {



    public static String read(String filename) throws IOException {

        BufferedReader in = new BufferedReader(
                new FileReader(filename)
        );

        String s;

        StringBuilder builder = new StringBuilder();

        while ( (s = in.readLine()) != null) {
            builder.append( s + "\n");
        }

        return builder.toString();

    }

    public static void main(String[] args) throws IOException {

        System.out.println(read("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\Java_Thinking\\A1\\Demo1.java"));



    }
}
