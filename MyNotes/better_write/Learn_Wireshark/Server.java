package better_write.Learn_Wireshark;

import java.net.ServerSocket;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/9
 * \* Time: 11:32
 * \* Description:
 * \
 */
public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(8881);
        socket.accept();
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }
}
