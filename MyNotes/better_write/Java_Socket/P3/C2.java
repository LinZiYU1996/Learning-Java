package better_write.Java_Socket.P3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 10:04
 * \* Description:
 * \
 */
public class C2 {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\LinZiYu\\Pictures\\2-13\\1.png";
        FileInputStream in = new FileInputStream(new File(path));
        byte[] bytes = new byte[2048];

        System.out.println("socket begin");
        Socket socket = new Socket("localhost",8088);
        System.out.println("socket end");

        OutputStream outputStream = socket.getOutputStream();

        int len = in.read(bytes);

        while (len!=-1) {

            outputStream.write(bytes,0,len);
            len = in.read(bytes);

        }

        outputStream.close();
        in.close();
        socket.close();


    }
}
