package better_write.Java_Socket.P7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:40
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        /*
        必须将ServerSocketChannel设置为非阻塞
        不然报错
         */
        channel.configureBlocking(false);
        ServerSocket serverSocket = channel.socket();
        serverSocket.bind(new InetSocketAddress("localhost",8899));

        System.out.println("A isregister   " + channel.isRegistered());

        Selector selector = Selector.open();
        SelectionKey selectionKey = channel.register(selector,SelectionKey.OP_ACCEPT);
        System.out.println(" B is register    " + channel.isRegistered());

        serverSocket.close();
        channel.close();

    }
}
