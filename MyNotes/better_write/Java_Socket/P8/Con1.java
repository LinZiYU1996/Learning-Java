package better_write.Java_Socket.P8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 10:30
 * \* Description:
 * \
 */
public class Con1 {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.bind(new InetSocketAddress("localhost",8888));
        SocketChannel socketChannel = channel.accept();
        socketChannel.close();
        channel.close();
        System.out.println("server end");



    }
}
