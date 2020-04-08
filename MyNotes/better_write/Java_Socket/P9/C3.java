package better_write.Java_Socket.P9;

import java.io.IOException;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 20:28
 * \* Description:
 * \
 */
public class C3 {

    public static void main(String[] args) throws IOException {

        String port = "localhost";

        Socket socket = new Socket(port,8899);
        socket.close();

    }
}
