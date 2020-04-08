package better_write.Java_Socket.P7;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 10:03
 * \* Description:
 * \
 */
public class T9 {

    public static void main(String[] args) throws IOException {

        SelectorProvider provider1 = SelectorProvider.provider();

        System.out.println(provider1);

        ServerSocketChannel c1 = null;

        c1 = ServerSocketChannel.open();

        SelectorProvider provider2 = c1.provider();

        System.out.println(provider2);

        c1.close();

    }
}
/*
sun.nio.ch.WindowsSelectorProvider@1b6d3586
sun.nio.ch.WindowsSelectorProvider@1b6d3586

 */