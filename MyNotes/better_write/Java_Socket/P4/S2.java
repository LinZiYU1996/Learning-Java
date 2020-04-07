package better_write.Java_Socket.P4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 11:57
 * \* Description:
 * \
 */
public class S2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        ObjectInputStream objin = new ObjectInputStream(in);
        ObjectOutputStream objout = new ObjectOutputStream(out);

        for (int i = 0; i < 5; i++) {

            UserInfo info = (UserInfo) objin.readObject();
            System.out.println("server"+info);

            UserInfo newInfo = new UserInfo();
            newInfo.setId(i+1);
            newInfo.setName("server"+i+1);
            newInfo.setPwd("server"+i+1);
            objout.writeObject(newInfo);
        }

        objin.close();
        objout.close();
        out.close();
        in.close();
        socket.close();
        serverSocket.close();


    }
}
