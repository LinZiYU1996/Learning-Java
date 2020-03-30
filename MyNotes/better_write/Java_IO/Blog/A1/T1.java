package better_write.Java_IO.Blog.A1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 17:25
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) throws IOException {

        InputStream inputstream = new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\bb.txt");

        int data = inputstream.read();
        while(data != -1) {
            //do something with data...
//            doSomethingWithData(data);

            System.out.println(data);
            data = inputstream.read();
        }
        inputstream.close();

    }

}
