package better_write.Java_IO.InputStream_API.ByteArrayInputStream_API;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:00
 * \* Description:
 * \
 */
public class Demo4 {

    //Closing a ByteArrayInputStream
    //When you are done with a Java ByteArrayInputStream you must close it. You close a ByteArrayInputStream by calling the its close() method. Here is an example of opening an ByteArrayInputStream, reading all data from it, and then closing it:



    public static void main(String[] args) throws IOException {

        byte[] bytes = "abcdef".getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int data = byteArrayInputStream.read();
        while(data != -1) {
            data = byteArrayInputStream.read();
        }
        byteArrayInputStream.close();


        /*
        Notice how the while loop continues until a -1 value is read from the ByteArrayInputStream read() method. After that,
        the while loop exits, and the ByteArrayInputStream close() method is called.

        The above code is not 100% robust. If an exception is thrown while reading data from the ByteArrayInputStream,
         the close() method is never called. To make the code more robust, you will have to use the Java try-with-resources construct.
         Proper exception handling for use of Java IO classes is also explained in my tutorial on Java IO Exception Handling.

        Here is an example of closing a Java ByteArrayInputStream using the try-with-resources construct:
         */


        try( ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream("abcdef".getBytes()) ) {

            int data1 = byteArrayInputStream1.read();
            while(data1 != -1){
                data1 = byteArrayInputStream.read();
            }
        }
    }
}
