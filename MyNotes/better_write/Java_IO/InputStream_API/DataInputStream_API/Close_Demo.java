package better_write.Java_IO.InputStream_API.DataInputStream_API;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/29
 * \* Time: 9:41
 * \* Description:
 * \
 */
public class Close_Demo {


    public static void main(String[] args) throws IOException {


        InputStream input = new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\InputStream_API\\DataInputStream_API\\data.bin");

        try(DataInputStream dataInputStream =
                    new DataInputStream(input)){

            int data = dataInputStream.readInt();

            int   int123     = dataInputStream.readInt();
            float float12345 = dataInputStream.readFloat();
            long  long789    = dataInputStream.readLong();
        }
/*
注意这并没有任何显式的调用close()方法。
也要注意创建FileInputStream示例并没有放在try-with-resources代码块里。这意味着try-with-resources并不会自动关闭FileInputStream。然而，当DataInputStream被关闭后它也会关闭它读的InputStream，所以FileInputStream也会在DataInputStream关闭后被关闭。

 */
    }
}
