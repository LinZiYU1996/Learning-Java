package better_write.Netty_Book.mytry.package1.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 21:08
 * \* Description:
 * \
 */
public class NIOClient {

    InetSocketAddress address;

    SocketChannel socketChannel;

    public NIOClient(String host, int port) throws IOException {

        this.address = new InetSocketAddress(host,port);
        this.socketChannel = SocketChannel.open(address);

    }

    public void client_run() throws IOException, InterruptedException {

        byte[] Msg = (new Date() + ": hello world").getBytes();

        ByteBuffer buffer = ByteBuffer.wrap(Msg);

        socketChannel.write(buffer);

        buffer.clear();

        Thread.sleep(2000);

    }

    public static void main(String[] args) throws IOException, InterruptedException {

        NIOClient nioClient = new NIOClient("localhost",9966);

        while (true) {
            nioClient.client_run();
        }

    }

}
