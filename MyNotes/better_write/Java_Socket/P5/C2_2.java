package better_write.Java_Socket.P5;

import java.io.IOException;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 20:56
 * \* Description:
 * \
 */
public class C2_2 {

    public static void main(String[] args) throws IOException {


        Socket socket1 = new Socket("localhost",8089);
        Socket socket2 = new Socket("localhost",8089);
        Socket socket3 = new Socket("localhost",8089);
        Socket socket4 = new Socket("localhost",8089);
        Socket socket5 = new Socket("localhost",8089);
// 第四次请求出现异常
    }
}
