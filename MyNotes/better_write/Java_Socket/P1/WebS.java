package better_write.Java_Socket.P1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:27
 * \* Description:
 * \
 */
public class WebS {

    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(6666);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        InputStreamReader reader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(reader);

        String getS = "";

        while (!"".equals(getS=bufferedReader.readLine())) {
            System.out.println(getS);
        }

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("HTPP/1.1 200 OK\r\n\r\n".getBytes());

        outputStream.flush();

        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();


    }
}
