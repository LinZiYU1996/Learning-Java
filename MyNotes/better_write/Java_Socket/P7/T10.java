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
 * \* Time: 10:06
 * \* Description:
 * \
 */
public class T10 {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.bind(new InetSocketAddress("localhost",8888));
        channel.configureBlocking(false);

        Selector s1 = Selector.open();
        Selector s2 = Selector.open();

        SelectionKey k1 = channel.register(s1,SelectionKey.OP_ACCEPT);

        System.out.println("k1 " +k1.hashCode());

        SelectionKey k2 = channel.register(s2,SelectionKey.OP_ACCEPT);
        System.out.println("k2 " +k2.hashCode());

        channel.close();



    }
}
/*
k1 960604060
k2 1349393271
 */