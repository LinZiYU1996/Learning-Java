package better_write.Java_Socket.P5;

import java.io.IOException;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 20:49
 * \* Description:
 * \
 */
public class C2 {

    public static void main(String[] args) throws IOException {

        System.out.println("client begin"+System.currentTimeMillis());
        Socket socket = new Socket("localhost",8045);
        System.out.println("client end"+System.currentTimeMillis());


    }
}
