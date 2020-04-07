package better_write.Java_Socket.P3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 10:20
 * \* Description:
 * \
 */
public class C4 {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("client ready");
        Socket socket = new Socket("localhost",8088);
        System.out.println("client end");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("111".getBytes());
        outputStream.write("11111".getBytes());
        outputStream.write("11111111".getBytes());
        Thread.sleep(5000000);
        socket.close();

    }
}
