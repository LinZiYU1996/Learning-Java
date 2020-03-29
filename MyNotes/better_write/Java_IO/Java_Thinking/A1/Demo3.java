package better_write.Java_IO.Java_Thinking.A1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:32
 * \* Description:
 * \
 */
public class Demo3 {

    public static void main(String[] args) throws IOException {


        DataInputStream in = new DataInputStream(
                new ByteArrayInputStream(
                        Demo1.read("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\Java_Thinking\\A1\\Demo1.java").getBytes()
                )
        );

        while (true) {
            System.out.println((char)in.readByte());
        }





    }
}
