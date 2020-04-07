package better_write.Java_Socket.P4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 11:27
 * \* Description:
 * \
 */
public class C1 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8888);
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write(" i am chinese".getBytes());
        outputStream.close();
        socket.close();

    }
}
