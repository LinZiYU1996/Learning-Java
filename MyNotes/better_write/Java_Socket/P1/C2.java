package better_write.Java_Socket.P1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:39
 * \* Description:
 * \
 */
public class C2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("so begin"+System.currentTimeMillis());
        Socket socket = new Socket("localhost",8088);
        System.out.println("so end" + System.currentTimeMillis());
        Thread.sleep(8000);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("I am bad guy".getBytes());
        outputStream.close();
        socket.close();

    }
}
