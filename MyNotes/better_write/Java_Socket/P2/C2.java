package better_write.Java_Socket.P2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/5
 * \* Time: 20:45
 * \* Description:
 * \
 */
public class C2 {

    public static void main(String[] args) throws IOException {
        System.out.println("c ready to lianjie"+System.currentTimeMillis());
        Socket socket = new Socket("localhost",8088);
        System.out.println("c end"+System.currentTimeMillis());

        char[] chars = new char[3];
        InputStream inputStream = socket.getInputStream();
        InputStreamReader r = new InputStreamReader(inputStream);
        System.out.println("sB being"+System.currentTimeMillis());
        int read = r.read(chars);
        System.out.println("sB end"+System.currentTimeMillis());
        while (read!=-1){
            System.out.println(new String(chars,0,read));
            read = r.read(chars);
        }
        System.out.println("");
        inputStream.close();
        socket.close();

    }
}

