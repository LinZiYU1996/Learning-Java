package better_write.Java_Socket.P7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:58
 * \* Description:
 * \
 */
public class T8 {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.bind(new InetSocketAddress("localhost",8888));

        channel.configureBlocking(false);

        Selector selector = Selector.open();
        SelectionKey selectionKey1 = channel.register(selector,SelectionKey.OP_ACCEPT);

        System.out.println("A "+selectionKey1+"  "+selectionKey1.hashCode());
        SelectionKey selectionKey2 = channel.keyFor(selector);
        System.out.println("B  "+selectionKey2+"  "+selectionKey2.hashCode());
        channel.close();

    }
}
/*

A sun.nio.ch.SelectionKeyImpl@3941a79c  960604060
B  sun.nio.ch.SelectionKeyImpl@3941a79c  960604060
 */