package better_write.Java_IO.Java_Thinking.A1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:34
 * \* Description:
 * \
 */
public class TestEof {


    /*

    一次一个字节的读取文件

     */
    public static void main(String[] args) throws IOException {

        DataInputStream dataInputStream = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\Java_Thinking\\A1\\Demo1.java")
                )
        );

        while (dataInputStream.available() != 0) {

            System.out.println((char) dataInputStream.readByte());
        }

    }
}
