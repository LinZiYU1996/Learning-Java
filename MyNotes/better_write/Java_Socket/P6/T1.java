package better_write.Java_Socket.P6;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 22:19
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        ServerSocket serverSocket = channel.socket();
        serverSocket.bind(new InetSocketAddress("localhost",8888));
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(in);
        char[] chars = new char[1024];

        int len = reader.read(chars);

        while (len != -1) {
            String s = new String(chars,0,len);
            System.out.println(s);
            len = reader.read(chars);
        }

        in.close();
        reader.close();
        socket.close();
        serverSocket.close();
        channel.close();


    }
}
