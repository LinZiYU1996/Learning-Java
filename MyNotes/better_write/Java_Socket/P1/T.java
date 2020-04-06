package better_write.Java_Socket.P1;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:14
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8088);

        System.out.println("阻塞开始"+System.currentTimeMillis());

        serverSocket.accept();

        System.out.println("阻塞结束" + System.currentTimeMillis());

        serverSocket.close();

    }
}
