package better_write.Java_Socket.P3;

import java.io.*;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 9:45
 * \* Description:
 * \
 */
public class C1 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8088);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

        ObjectOutputStream objOut = new ObjectOutputStream(out);

        String s1 = "server 1\n";
        String s2 = "server 2\n";
        String s3 = "server 3\n";

        int allLen = (s1+s2+s3).getBytes().length;
        objOut.writeInt(allLen);
        objOut.flush();
        objOut.write(s1.getBytes());
        objOut.write(s2.getBytes());
        objOut.write(s3.getBytes());
        objOut.flush();

        ObjectInputStream objIn = new ObjectInputStream(in);
        int len = objIn.readInt();
        byte[] bytes = new byte[len];

        objIn.readFully(bytes);
        String newS = new String(bytes);
        System.out.println(newS);

        s1 = "server 4\n";
        s2 = "server 5\n";
        s3 = "server 6\n";

        allLen = (s1+s2+s3).getBytes().length;
        objOut.writeInt(allLen);
        objOut.flush();
        objOut.write(s1.getBytes());
        objOut.write(s2.getBytes());
        objOut.write(s3.getBytes());
        objOut.flush();

        len = objIn.readInt();
        bytes = new byte[len];

        objIn.readFully(bytes);
        newS = new String(bytes);
        System.out.println(newS);

        objIn.close();
        objOut.close();
        socket.close();
    }
}
