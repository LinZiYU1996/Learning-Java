package better_write.Java_Socket.P7;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:23
 * \* Description:
 * \
 */
public class C3 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8866);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("发送数据的C3".getBytes());
        outputStream.close();
        socket.close();

    }
}
