package better_write.Java_Socket.P7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:21
 * \* Description:
 * \
 */
public class S3 {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.bind(new InetSocketAddress("localhost",8866));
        SocketChannel channel1 = channel.accept();
        ByteBuffer buffer = ByteBuffer.allocate(2);
        int len = channel1.read(buffer);
        while (len != -1) {
            String s = new String(buffer.array());
            System.out.println(s);
            buffer.flip();
            len = channel1.read(buffer);
        }
        channel1.close();
        channel.close();

    }
}
