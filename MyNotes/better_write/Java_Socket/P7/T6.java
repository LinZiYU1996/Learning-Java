package better_write.Java_Socket.P7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketOption;
import java.net.UnknownHostException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/7
 * \* Time: 9:48
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) throws IOException {

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(3500);
                    Socket socket = new Socket("localhost",9966);
                    socket.close();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.bind(new InetSocketAddress("localhost",9966));
        SocketChannel channel1 = channel.accept();

        Set<SocketOption<?>> set1 = channel.supportedOptions();
        Set<SocketOption<?>> set2 = channel1.supportedOptions();

        Iterator i1 = set1.iterator();
        Iterator i2 = set2.iterator();

        System.out.println("ServerSocketChannel  supportedOptions ");

        while (i1.hasNext()) {
            SocketOption each = (SocketOption) i1.next();
            System.out.println(each.name() +"     "+each.getClass().getName()    );

        }

        System.out.println("");
        System.out.println("");

        System.out.println(" SocketChannel  supportedOptions ");
        while (i2.hasNext()) {
            SocketOption each = (SocketOption) i2.next();
            System.out.println(each.name() +"     "+each.getClass().getName()    );
        }

        channel.close();
        channel1.close();
    }
}

/*
ServerSocketChannel  supportedOptions
SO_REUSEADDR     java.net.StandardSocketOptions$StdSocketOption
SO_RCVBUF     java.net.StandardSocketOptions$StdSocketOption
IP_TOS     java.net.StandardSocketOptions$StdSocketOption


 SocketChannel  supportedOptions
IP_TOS     java.net.StandardSocketOptions$StdSocketOption
SO_KEEPALIVE     java.net.StandardSocketOptions$StdSocketOption
SO_OOBINLINE     sun.nio.ch.ExtendedSocketOption$1
SO_REUSEADDR     java.net.StandardSocketOptions$StdSocketOption
SO_RCVBUF     java.net.StandardSocketOptions$StdSocketOption
TCP_NODELAY     java.net.StandardSocketOptions$StdSocketOption
SO_SNDBUF     java.net.StandardSocketOptions$StdSocketOption
SO_LINGER     java.net.StandardSocketOptions$StdSocketOption
 */