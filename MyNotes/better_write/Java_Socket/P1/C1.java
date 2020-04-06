package better_write.Java_Socket.P1;

import java.io.IOException;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:33
 * \* Description:
 * \
 */
public class C1 {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("socket begin" + System.currentTimeMillis());
        Socket socket = new Socket("localhost",8088);
        System.out.println("socket end" + System.currentTimeMillis());
        Thread.sleep(10000);
        socket.close();
    }
}
