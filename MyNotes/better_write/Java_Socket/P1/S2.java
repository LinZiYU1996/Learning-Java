package better_write.Java_Socket.P1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:36
 * \* Description:
 * \
 */
public class S2 {

    public static void main(String[] args) throws IOException {

        char[] chars = new char[3];
        ServerSocket serverSocket = new ServerSocket(8088);

        System.out.println("acc begin"+System.currentTimeMillis());
        Socket socket = serverSocket.accept();
        System.out.println("acc end" + System.currentTimeMillis());

        InputStream inputStream = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        System.out.println("re begin"+System.currentTimeMillis());
        int readl = reader.read(chars);
        while (readl!=-1){
            String news = new String(chars,0,readl);
            System.out.println(news);
            readl = reader.read(chars);
        }
        System.out.println("re end"+System.currentTimeMillis());
        inputStream.close();
        reader.close();
        socket.close();
        serverSocket.close();

    }
}
