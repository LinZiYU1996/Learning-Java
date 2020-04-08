package better_write.Java_Socket.P7;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:47
 * \* Description:
 * \
 */
public class T5 {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        Object lock = channel.blockingLock();
        System.out.println(lock);
        channel.close();

    }
}
