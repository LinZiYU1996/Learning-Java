package better_write.Java_IO.Blog.A7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/31
 * \* Time: 10:29
 * \* Description:
 * \
 */
public class T3 {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\bb.txt");

        PrintStream printStream = new PrintStream(file);

        printStream.print('a');



    }
}
