package better_write.Java_IO.Byte_Char_Arrays;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 10:45
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        output.write("hdhdsjdhsjdhsjdhsj".getBytes("UTF-8"));

        byte[] bytes = output.toByteArray();

        for (byte b : bytes) {
            System.out.println(b);
        }

    }
}
