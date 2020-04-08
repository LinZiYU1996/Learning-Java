package better_write.Java_Socket.P9;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 20:12
 * \* Description:
 * \
 */
public class T1 {



    public static void main(String[] args) throws IOException {

        ServerSocketChannel channel = ServerSocketChannel.open();
        SocketChannel socketChannel = null;
        channel.configureBlocking(false);
        channel.bind(new InetSocketAddress("localhost",9901));

        Selector selector = Selector.open();
        channel.register(selector, SelectionKey.OP_ACCEPT);

        boolean isrun = true;
        while (isrun == true) {
            selector.select();
            Set<SelectionKey> set = selector.selectedKeys();
            Iterator<SelectionKey> iterator = set.iterator();
            while (iterator.hasNext()) {

                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isAcceptable()) {
                    socketChannel = channel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_WRITE);
                }
                if (key.isWritable()) {
                    RandomAccessFile file = new RandomAccessFile("E:\\百度云下载\\[xingk.cc 星空家园]RMDMY.E09.540P\\1.mp4","rw");
                    System.out.println(file.length());
                    FileChannel fileChannel = file.getChannel();
                    fileChannel.transferTo(0,file.length(),socketChannel);
                    fileChannel.close();
                    socketChannel.close();

                }

            }

        }

        channel.close();

    }
}
