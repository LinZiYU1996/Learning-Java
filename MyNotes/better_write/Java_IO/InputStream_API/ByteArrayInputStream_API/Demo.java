package better_write.Java_IO.InputStream_API.ByteArrayInputStream_API;

import java.io.ByteArrayInputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 15:45
 * \* Description:
 * \
 */
public class Demo {


    public static void main(String[] args) {

//        ByteArrayInputStream


        String s = "abcdefghijklmn";

        byte[] resource = s.getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(resource);

        System.out.println(byteArrayInputStream.available());

        System.out.println("");
        while (byteArrayInputStream.read() != -1) {

            System.out.println(byteArrayInputStream.read());


        }


    }
}
