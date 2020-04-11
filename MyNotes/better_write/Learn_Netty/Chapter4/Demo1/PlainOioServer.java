package better_write.Learn_Netty.Chapter4.Demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 11:11
 * \* Description:
 * \
 */
public class PlainOioServer {

    /*
    未使用 Netty 的阻塞网络编程
     */

    public void serve(int port) throws IOException {

        final ServerSocket serverSocket = new ServerSocket(port);

        try {

            for (;;) {

                final Socket clent = serverSocket.accept();

                System.out.println("Accepted connection from "
                + clent);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        OutputStream out;

                        try {
                            out = clent.getOutputStream();
                            out.write("Hi!\r\n".getBytes(
                                    Charset.forName("UTF-8")
                            ));
                            clent.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                clent.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();



            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
