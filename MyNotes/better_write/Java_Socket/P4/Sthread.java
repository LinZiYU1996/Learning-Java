package better_write.Java_Socket.P4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 11:30
 * \* Description:
 * \
 */
public class Sthread extends Thread{

    private Socket socket;

    public Sthread(Socket socket){
        super();
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            char[] chars = new char[1000];
            int len = -1;

            while ( (len = reader.read(chars)) != -1 ) {

                String s = new String(chars, 0, len);
                System.out.println(s);
            }
            reader.close();
            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
