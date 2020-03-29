package better_write.Java_IO.InputStream_API.ByteArrayInputStream_API;

import java.io.ByteArrayInputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 19:53
 * \* Description:
 * \
 */
public class Demo2 {


    public static void main(String[] args) {

        //mark()
        //The mark() method of the ByteArrayInputStream class sets an internal mark at the current byte position -
        // meaning right after the previous byte read. The mark() method takes a parameter telling how many bytes can be read past this mark,
        // before this mark becomes invalid. By default, if no mark has been explicitly set, the ByteArrayInputStream has marked position 0,
        // or the position at the offset passed to its constructor. Here is an example of setting a mark in a ByteArrayInputStream via its mark() method:

        byte[] bytes = "abcdef".getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int data = byteArrayInputStream.read();  // read 'a'
//        data = byteArrayInputStream.read();  // read 'b'
//        data = byteArrayInputStream.read();  // read 'c'

        byteArrayInputStream.mark(1024);     // mark set before reading 'd'
        data = byteArrayInputStream.read();  // read 'd'
        System.out.println(data + "\n");
        data = byteArrayInputStream.read();  // read 'e'
        System.out.println(data + "\n");
        data = byteArrayInputStream.read();  // read 'f'
        System.out.println(data + "\n");
    }
}
