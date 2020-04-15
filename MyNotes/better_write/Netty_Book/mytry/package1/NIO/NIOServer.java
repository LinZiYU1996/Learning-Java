package better_write.Netty_Book.mytry.package1.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 21:00
 * \* Description:
 * \
 */
public class NIOServer {

    Selector server_selector;
    Selector client_selector;
    ServerSocketChannel serverSocketChannel;

    public NIOServer(int port) throws IOException {

        this.server_selector = Selector.open();
        this.client_selector = Selector.open();
        this.serverSocketChannel = ServerSocketChannel.open();
        this.serverSocketChannel.bind(new InetSocketAddress(port));
        this.serverSocketChannel.configureBlocking(false);
        this.serverSocketChannel.register(server_selector, SelectionKey.OP_ACCEPT);

    }

    public void server_run() throws IOException {

        if (server_selector.select(1) > 0) {
            Set<SelectionKey> set = server_selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = set.iterator();

            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();

                if (key.isAcceptable()) {
                    try {
                        // (1) 每来一个新连接，不需要创建一个线程，而是直接注册到clientSelector
                        SocketChannel clientChannel = ((ServerSocketChannel) key.channel()).accept();
                        clientChannel.configureBlocking(false);
                        clientChannel.register(client_selector, SelectionKey.OP_READ);
                    } finally {
                        keyIterator.remove();
                    }
                }

            }
        }

        if (client_selector.select(1) > 0) {
            Set<SelectionKey> set = client_selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = set.iterator();

            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();

                if (key.isReadable()) {
                    try {
                        SocketChannel clientChannel = (SocketChannel) key.channel();
                        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                        // (3) 面向 Buffer
                        clientChannel.read(byteBuffer);
                        byteBuffer.flip();
                        System.out.println(
                                Charset.defaultCharset().newDecoder().decode(byteBuffer).toString());
                    } finally {
                        keyIterator.remove();
                        key.interestOps(SelectionKey.OP_READ);
                    }
                }

            }
        }

    }


    public static void main(String[] args) throws IOException {

        NIOServer nioServer = new NIOServer(9966);

        while (true) {

            nioServer.server_run();
        }

    }




}
