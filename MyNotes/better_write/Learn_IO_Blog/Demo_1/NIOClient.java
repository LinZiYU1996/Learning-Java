package better_write.Learn_IO_Blog.Demo_1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/8
 * \* Time: 9:49
 * \* Description:
 * \
 */
public class NIOClient {
/*
零拷贝
Java NIO中提供的FileChannel拥有transferTo和transferFrom两个方法，可直接把FileChannel中的数据拷贝到另外一个Channel，
或者直接把另外一个Channel中的数据拷贝到FileChannel。该接口常被用于高效的网络/文件的数据传输和大文件拷贝。在操作系统支持的情况下
，通过该方法传输数据并不需要将源数据从内核态拷贝到用户态，再从用户态拷贝到目标通道的内核态，同时也避免了两次用户态和内核态间的上下文切换，
也即使用了“零拷贝”，所以其性能一般高于Java IO中提供的方法。

使用FileChannel的零拷贝将本地文件内容传输到网络的示例代码如下所示。
 */
    public static void main(String[] args) throws IOException {


        SocketChannel socketChannel = SocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(1234);
        socketChannel.connect(address);

        RandomAccessFile file = new RandomAccessFile(
                NIOClient.class.getClassLoader().getResource("test.txt").getFile(), "rw");
        FileChannel channel = file.getChannel();
        channel.transferTo(0, channel.size(), socketChannel);
        channel.close();
        file.close();
        socketChannel.close();

    }
}
