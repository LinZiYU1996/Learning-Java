package better_write.Java_IO.Byte_Char_Arrays;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 10:48
 * \* Description:
 * \
 */
public class T2 {


    public static void main(String[] args) throws IOException {

        CharArrayWriter writer = new CharArrayWriter();

        writer.write("abcghdh");

        char[] chars = writer.toCharArray();

        for (char c : chars) {
            System.out.println(c);
        }


    }
}
