package better_write.Learn_Wireshark;

import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/9
 * \* Time: 11:32
 * \* Description:
 * \
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8881);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("111".getBytes());
        outputStream.write("1111l".getBytes());
        outputStream.write("11111l111l".getBytes());
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }


}
