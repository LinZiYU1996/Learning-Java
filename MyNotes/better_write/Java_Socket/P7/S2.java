package better_write.Java_Socket.P7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:19
 * \* Description:
 * \
 */
public class S2 {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel channel = ServerSocketChannel.open();
        System.out.println(channel.isBlocking());
        channel.configureBlocking(false);
        System.out.println(channel.isBlocking());
        channel.bind(new InetSocketAddress("localhost",8866));
        System.out.println("begin");
        SocketChannel channel1 = channel.accept();
        System.out.println("end");
        channel1.close();
        channel.close();

    }
}
