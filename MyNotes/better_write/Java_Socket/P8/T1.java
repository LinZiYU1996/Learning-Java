package better_write.Java_Socket.P8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 10:31
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        long begin = 0;
        long end = 0;

        boolean conn = false;

        try {

            SocketChannel socketChannel = SocketChannel.open();
            begin = System.currentTimeMillis();
            conn = socketChannel.connect(new InetSocketAddress("localhost",8888));
            end = System.currentTimeMillis();
            System.out.println("正常连接耗时 "+(end - begin) + "      conn   "+conn);
            socketChannel.close();

        } catch (IOException e) {
            e.printStackTrace();
            end = System.currentTimeMillis();
            System.out.println("异常连接耗时 "+(end - begin) + "      conn   "+conn);
        }


    }
}
