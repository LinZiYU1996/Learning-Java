package better_write.Java_IO.Java_Thinking.A1;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:43
 * \* Description:
 * \
 */
public class BasicFileOut {

    static String file = "a.out";

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(
                new StringReader(
                        Demo1.read("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\Java_Thinking\\A1\\Demo1.java")
                )
        );

        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file))
        );

        int line = 1;

        String s;

        while ((s = in.readLine()) != null) {
            out.println(line++ + " : " + s);
        }

        out.close();

        System.out.println(Demo1.read(file));

    }
}
