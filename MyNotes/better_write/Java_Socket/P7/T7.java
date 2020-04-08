package better_write.Java_Socket.P7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:56
 * \* Description:
 * \
 */
public class T7 {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.bind(new InetSocketAddress("localhost",8888));
        SocketChannel channel1 = channel.accept();
        InetSocketAddress address = (InetSocketAddress) channel.getLocalAddress();

        System.out.println(address.getHostString());
        System.out.println(address.getPort());
        channel.close();

    }
}
