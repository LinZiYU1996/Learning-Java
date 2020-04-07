package better_write.Java_Socket.P4;

import java.io.*;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 20:40
 * \* Description:
 * \
 */
public class C2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Socket socket = new Socket("localhost",8888);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        ObjectInputStream oIn = new ObjectInputStream(in);
        ObjectOutputStream oOut = new ObjectOutputStream(out);

        for (int i = 0; i < 5; i++) {
            UserInfo info = new UserInfo();
            info.setId(i+1);
            info.setName("client"+i+1);
            info.setPwd("client"+i+1);
            oOut.writeObject(info);

            UserInfo getU = (UserInfo) oIn.readObject();
            System.out.println("client"+getU);
        }
        oIn.close();
        oOut.close();
        in.close();
        out.close();
        socket.close();

    }
}
