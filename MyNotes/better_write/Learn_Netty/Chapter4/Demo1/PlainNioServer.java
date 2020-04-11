package better_write.Learn_Netty.Chapter4.Demo1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 11:15
 * \* Description:
 * \
 */
public class PlainNioServer {


    /*
    未使用 Netty 的异步网络编程
     */
    public void serve(int port) throws IOException {

        ServerSocketChannel socketChannel = ServerSocketChannel.open();

        socketChannel.configureBlocking(false);

        ServerSocket socket = socketChannel.socket();

        InetSocketAddress address = new InetSocketAddress(port);

        socket.bind(address);

        Selector selector = Selector.open();

        socketChannel.register(selector, SelectionKey.OP_ACCEPT);

        final ByteBuffer msg = ByteBuffer.wrap("Hi!\r\n".getBytes());

        for (;;) {

            selector.select();

            Set<SelectionKey> readyKeys = selector.selectedKeys();

            Iterator<SelectionKey> iterator = readyKeys.iterator();

            while (iterator.hasNext()) {

                SelectionKey key = iterator.next();

                iterator.remove();

                if (key.isAcceptable()) {

                    ServerSocketChannel server = (ServerSocketChannel) key.channel();

                    SocketChannel client = server.accept();

                    client.configureBlocking(false);

                    client.register(selector,SelectionKey.OP_WRITE
                    | SelectionKey.OP_READ,msg.duplicate());
                    System.out.println(
                            "Accepted connection from " + client);
                }

                if (key.isWritable()) {

                    SocketChannel client = (SocketChannel) key.channel();

                    ByteBuffer buffer =
                            (ByteBuffer)key.attachment();

                    while (buffer.hasRemaining()) {
                        if (client.write(buffer) == 0) {
                            break;
                        }
                    }

                    client.close();

                }

            }


        }




    }
}
