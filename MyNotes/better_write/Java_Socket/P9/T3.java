package better_write.Java_Socket.P9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 20:26
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws IOException {

        String port = "localhost";
        ServerSocketChannel channel = ServerSocketChannel.open();
        System.out.println("1");
        channel.bind(new InetSocketAddress(port,8899));
        System.out.println("2");
        channel.configureBlocking(false);
        System.out.println("3");
        Selector selector1 = Selector.open();
        System.out.println("4");
        SelectionKey selectionKey1 = channel.register(selector1,SelectionKey.OP_ACCEPT);
        System.out.println("5");
        int c = selector1.select();
        System.out.println(c);
        channel.close();
        System.out.println("end");


    }
}
