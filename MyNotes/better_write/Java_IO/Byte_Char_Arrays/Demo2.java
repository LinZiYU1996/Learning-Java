package better_write.Java_IO.Byte_Char_Arrays;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 10:42
 * \* Description:
 * \
 */
public class Demo2 {


    public static void main(String[] args) throws IOException {

        String s = "abcdefghijklmn";

        char[] chars = s.toCharArray();

        Reader reader = new CharArrayReader(chars);

        int data = reader.read();

        while (data != -1) {

            System.out.println(data);

            data = reader.read();

        }

    }
}
