package better_write.Java_IO.Byte_Char_Arrays;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 10:38
 * \* Description:
 * \
 */
public class Demo {


    public static void main(String[] args) throws IOException {

        String s = "abcdefghijklmn";

        byte[] bytes = s.getBytes();

        InputStream input = new ByteArrayInputStream(bytes);

        int data = input.read();

        while (data != -1) {
            System.out.println(data);

            data = input.read();
        }


    }
}
