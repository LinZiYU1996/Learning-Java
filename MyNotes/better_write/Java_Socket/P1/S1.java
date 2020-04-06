package better_write.Java_Socket.P1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:32
 * \* Description:
 * \
 */
public class S1 {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new byte[1024];
        ServerSocket serverSocket = new ServerSocket(8088);
        System.out.println("accept begin " + System.currentTimeMillis());
        Socket socket = serverSocket.accept();
        System.out.println("accept end" + System.currentTimeMillis());

        InputStream inputStream = socket.getInputStream();
        System.out.println("read begin "+ System.currentTimeMillis());
        int reaL = inputStream.read(bytes);
        System.out.println("read end"+System.currentTimeMillis());
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
