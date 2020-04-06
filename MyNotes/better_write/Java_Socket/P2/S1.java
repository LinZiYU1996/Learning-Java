package better_write.Java_Socket.P2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:43
 * \* Description:
 * \
 */
public class S1 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8088);
        System.out.println("ser beign"+System.currentTimeMillis());
        Socket socket = serverSocket.accept();
        System.out.println("ser end"+System.currentTimeMillis());

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("I am from server".getBytes());
        outputStream.close();
        serverSocket.close();
        socket.close();

    }
}
