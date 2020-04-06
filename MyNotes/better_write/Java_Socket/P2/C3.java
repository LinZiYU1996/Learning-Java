package better_write.Java_Socket.P2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:54
 * \* Description:
 * \
 */
public class C3 {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("client ready");
        Socket socket = new Socket("localhost",8088);
        System.out.println("client end");
        Thread.sleep(9000);
        OutputStream out = socket.getOutputStream();
        out.write("abcoo".getBytes());
        Thread.sleep(4500);
        out.write("abcoo2".getBytes());
        Thread.sleep(4500);
        out.write("abcoo3".getBytes());
        Thread.sleep(4500);
        out.write("abcoo4".getBytes());
        Thread.sleep(4500);
        out.write("abcoo5".getBytes());
        Thread.sleep(4500);

        System.out.println("client end");

        out.close();
        socket.close();

        System.out.println("over client");

    }
}
