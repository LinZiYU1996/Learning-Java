package better_write.Java_Socket.P3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 9:45
 * \* Description:
 * \
 */
public class S1 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();

        InputStream in = socket.getInputStream();
        ObjectInputStream objIn = new ObjectInputStream(in);
        int len = objIn.readInt();
        byte[] bytes = new byte[len];
        objIn.readFully(bytes);
        String newString = new String(bytes);
        System.out.println(newString);

        OutputStream out = socket.getOutputStream();
        String str1 = "hello client1\n";
        String str2 = "hello client2\n";
        String str3 = "hello client3\n";

        int allSlen = (str1+str2+str3).getBytes().length;

        ObjectOutputStream objOut = new ObjectOutputStream(out);
        objOut.writeInt(allSlen);
        objOut.flush();

        objOut.write(str1.getBytes());
        objOut.write(str2.getBytes());
        objOut.write(str3.getBytes());
        objOut.flush();

        len = objIn.readInt();
        bytes = new byte[len];
        objIn.readFully(bytes);
        newString = new String(bytes);
        System.out.println(newString);

        String str4 = "hello client4\n";
        String str5 = "hello client5\n";
        String str6 = "hello client6\n";

        allSlen = (str4+str5+str6).getBytes().length;

        objOut.writeInt(allSlen);
        objOut.flush();

        objOut.write(str4.getBytes());
        objOut.write(str5.getBytes());
        objOut.write(str6.getBytes());
        objOut.flush();

        in.close();
        serverSocket.close();
        socket.close();


    }
}
