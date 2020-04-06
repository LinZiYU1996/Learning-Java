package better_write.Java_Socket.P1;

import java.io.IOException;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:19
 * \* Description:
 * \
 */
public class Client1 {

    public static void main(String[] args) throws IOException {

        System.out.println("连接准备"+System.currentTimeMillis());
        Socket socket = new Socket("localhost",8088);
        System.out.println("连接结束"+System.currentTimeMillis());
        socket.close();

    }
}
