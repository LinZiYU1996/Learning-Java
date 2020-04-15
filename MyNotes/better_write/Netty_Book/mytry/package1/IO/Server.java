package better_write.Netty_Book.mytry.package1.IO;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 20:31
 * \* Description:
 * \
 */
public class Server {

    ServerSocket serverSocket;

    public Server( int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }


    public void server_run() throws IOException {
        System.out.println("server");
        Socket socket = serverSocket.accept();
        int len;
        byte[] data = new byte[1024];
        InputStream inputStream = socket.getInputStream();
        // 按字节流方式读取数据
        while ((len = inputStream.read(data)) != -1) {
            System.out.println(new String(data, 0, len));
        }

    }

    public static void main(String[] args) throws IOException {

        Server server = new Server(6699);

        while (true) {
            server.server_run();
        }

    }
}
