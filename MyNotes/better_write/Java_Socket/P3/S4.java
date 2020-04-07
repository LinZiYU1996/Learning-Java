package better_write.Java_Socket.P3;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 10:20
 * \* Description:
 * \
 */
public class S4 {

    public static void main(String[] args) throws IOException, InterruptedException {

        ServerSocket serverSocket = new ServerSocket(8088);
        System.out.println("server begin");
        serverSocket.accept();

        System.out.println("server over");

        Thread.sleep(52000);
        serverSocket.close();


    }
}
