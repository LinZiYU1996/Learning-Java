package better_write.Java_Socket.P8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 20:06
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) throws IOException {

        long begin = 0;
        long end = 0;

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        boolean conn = socketChannel.connect(new InetSocketAddress("localhost",7878));

        if (conn == false) {
            System.out.println("conn false");
            while (!socketChannel.finishConnect()) {
                System.out.println("一直尝试连接");
            }
        }

        socketChannel.close();
    }
}
