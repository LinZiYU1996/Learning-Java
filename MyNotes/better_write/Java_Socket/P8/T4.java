package better_write.Java_Socket.P8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 10:52
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws IOException {

        SocketChannel socketChannel = null;
        socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        System.out.println(socketChannel.isConnectionPending());
        socketChannel.connect(new InetSocketAddress("192.168.0.123",8099));
        System.out.println(socketChannel.isConnectionPending());
        socketChannel.close();


    }
}
