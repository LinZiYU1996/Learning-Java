package better_write.Java_Socket.P7;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:44
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        System.out.println("is open   " + channel.isOpen());

        channel.close();

        System.out.println("is open   " + channel.isOpen());

    }
}
