package better_write.Netty_Book.mytry.package1.IO;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 20:38
 * \* Description:
 * \
 */
public class Client {

    Socket socket;

    public Client(String host, int port) throws IOException {
        this.socket = new Socket(host,port);

    }

    public void client_run() throws IOException, InterruptedException {
        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
       Client client = new Client("127.0.0.1",6699);

       while (true) {

           client.client_run();
           Thread.sleep(2000);

       }

    }
}
