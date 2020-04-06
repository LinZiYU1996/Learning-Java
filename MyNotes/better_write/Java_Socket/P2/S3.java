package better_write.Java_Socket.P2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:54
 * \* Description:
 * \
 */
public class S3 {

    public static void main(String[] args) throws IOException {

        char[] chars = new char[15];
        ServerSocket serverSocket = new ServerSocket(8088);
        System.out.println("server begin");
        Socket socket = serverSocket.accept();
        System.out.println("server end");

        InputStream in = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(in);
        System.out.println("SB begin");
        int len = reader.read(chars);
        while (len!=-1) {
            System.out.println(new String(chars,0,len));
            len = reader.read(chars);
        }
        in.close();
        socket.close();
        serverSocket.close();
        System.out.println("Server over");
    }
}
