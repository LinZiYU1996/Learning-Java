package better_write.Java_Socket.P8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 10:48
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) {

        SocketChannel socketChannel = null;

        try {

            socketChannel = SocketChannel.open();
            System.out.println(socketChannel.isConnectionPending());
            socketChannel.connect(new InetSocketAddress("192.168.0.123",8099));
            socketChannel.close();

        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("catch "+socketChannel.isConnectionPending());
        }

    }
}
