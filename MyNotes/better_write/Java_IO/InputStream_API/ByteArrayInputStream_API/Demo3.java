package better_write.Java_IO.InputStream_API.ByteArrayInputStream_API;

import java.io.ByteArrayInputStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 19:56
 * \* Description:
 * \
 */
public class Demo3 {


    public static void main(String[] args) {

        //reset()
        //The reset() method of the ByteArrayInputStream resets how far it has read into the byte array.
        // The index will be reset back to the last mark set on the ByteArrayInputStream. By default, if no mark has been explicitly set,
        // the ByteArrayInputStream has marked position 0, or the position at the offset passed to its constructor.
        // Here is an example of using the ByteArrayInputStream reset() method:

        byte[] bytes = "abcdef".getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int data = byteArrayInputStream.read();  // read 'a'


//        data = byteArrayInputStream.read();  // read 'b'
//        data = byteArrayInputStream.read();  // read 'c'

        byteArrayInputStream.mark(1024);     // mark set before reading 'd'
        data = byteArrayInputStream.read();  // read 'd'
        System.out.println((char) data + "\n");
        data = byteArrayInputStream.read();  // read 'e'
        System.out.println((char) data + "\n");

        data = byteArrayInputStream.read();  // read 'f'
        System.out.println((char) data + "\n");

        System.out.println("----------------");

        byteArrayInputStream.reset();        // reset to mark before 'd'

        data = byteArrayInputStream.read();  // read 'd'
        System.out.println((char) data + "\n");

        data = byteArrayInputStream.read();  // read 'e'
        System.out.println((char) data + "\n");

        data = byteArrayInputStream.read();  // read 'f'
        System.out.println((char) data + "\n");

        /*
        b

        c

        d

        ----------------
        b

        c

        d

         */


    }
}
