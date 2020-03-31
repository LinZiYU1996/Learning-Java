package better_write.Java_IO.Blog.A6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/30
 * \* Time: 20:33
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        String path = "E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\t1.txt";

        FileInputStream inputStream = new FileInputStream(path);

        PushbackInputStream in = new PushbackInputStream(inputStream);

        int data = 0;

        while ((data = in.read()) != -1) {

            if ((char)data == '5'){

                in.unread(data);
                data = in.read();
//                System.out.println("unread " +(char)data);
            } else {
                System.out.println((char)data);
            }

        }
    }
}
