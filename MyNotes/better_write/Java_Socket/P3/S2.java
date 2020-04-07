package better_write.Java_Socket.P3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 10:04
 * \* Description:
 * \
 */
public class S2 {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new byte[2048];
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();

        InputStream in = socket.getInputStream();
        int len = in.read(bytes);

        FileOutputStream out = new FileOutputStream(new File("C:\\Users\\LinZiYu\\Pictures\\2-13\\1.png"));

        while ( len != -1) {

            out.write(bytes,0,len);
            len = in.read(bytes);
        }

        out.close();
        in.close();
        socket.close();
        serverSocket.close();

    }
}
