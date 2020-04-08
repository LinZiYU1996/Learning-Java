package better_write.Java_Socket.P9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 20:17
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) throws IOException {

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("localhost",9901));
        Selector selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_CONNECT);
        boolean run = true;
        while (run == true) {

            System.out.println("begin sel");

            if (socketChannel.isOpen() == true) {
                selector.select();
                System.out.println("end sel");
                Set<SelectionKey> set = selector.selectedKeys();
                Iterator<SelectionKey> iterator = set.iterator();
                while (iterator.hasNext()) {

                    SelectionKey key = iterator.next();
                    iterator.remove();

                    if (key.isConnectable()) {
                        while (!socketChannel.finishConnect()) {

                        }
                        socketChannel.register(selector,SelectionKey.OP_READ);
                    }
                    if (key.isReadable()) {
                        ByteBuffer buffer = ByteBuffer.allocate(5000);
                        int len = socketChannel.read(buffer);
                        buffer.flip();
                        long conut = 0;
                        while (len != -1) {
                            conut = conut + len;
                            len = socketChannel.read(buffer);
                            System.out.println(conut + "*" + len);
                        }
                        System.out.println("读取结束");
                        socketChannel.close();
                    }
                }
            }

        }


    }
}
