package better_write.Java_Socket.P4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 11:27
 * \* Description:
 * \
 */
public class S1 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);
        int runTag = 1;
        while (runTag==1) {

            Socket socket = serverSocket.accept();
            Sthread sthread = new Sthread(socket);
            sthread.start();

        }

        serverSocket.close();

    }
}
