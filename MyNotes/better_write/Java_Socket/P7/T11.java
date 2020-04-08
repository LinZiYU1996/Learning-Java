package better_write.Java_Socket.P7;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 10:10
 * \* Description:
 * \
 */
public class T11 {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel c1 = null;

        c1 = ServerSocketChannel.open();

        c1.configureBlocking(false);

        ServerSocketChannel c2 = null;

        c2 = ServerSocketChannel.open();

        c2.configureBlocking(false);

        Selector s1 = Selector.open();

        SelectionKey k1 = c1.register(s1,SelectionKey.OP_ACCEPT);

        SelectionKey k2 = c2.register(s1,SelectionKey.OP_ACCEPT);

        System.out.println(k1);

        System.out.println(k2);

        c1.close();

        c2.close();



    }
}
