package better_write.Java_Socket.P6;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 22:22
 * \* Description:
 * \
 */
public class C1 {

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket("localhost",8888);
        OutputStream outputStream = socket.getOutputStream();

        OutputStreamWriter writer = new OutputStreamWriter(outputStream);

        writer.write("abcdefg");

        Thread.sleep(9000);
        outputStream.close();
        writer.close();
        socket.close();

    }
}
