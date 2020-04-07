package better_write.Java_Socket.P5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 20:54
 * \* Description:
 * \
 */
public class S2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        ServerSocket serverSocket = new ServerSocket(8089,3);
        //        Thread.sleep(6655)的目的是不让ServerSocket调用accept方法
        // 而是由客户端Socket来发起连接请求
        //然后在执行accept方法时只能接受3个连接
        Thread.sleep(6655);

        System.out.println("acc1 begin");
        Socket socket1 = serverSocket.accept();
        System.out.println("acc1 end");

        System.out.println("acc2 begin");
        Socket socket2 = serverSocket.accept();
        System.out.println("acc2 end");

        System.out.println("acc3 begin");
        Socket socket3 = serverSocket.accept();
        System.out.println("acc3 end");

        System.out.println("acc4 begin");
        Socket socket4 = serverSocket.accept();
        System.out.println("acc4 end");

        System.out.println("acc5 begin");
        Socket socket5 = serverSocket.accept();
        System.out.println("acc5 end");

        socket1.close();
        socket2.close();
        socket3.close();
        socket4.close();
        socket5.close();
        serverSocket.close();


    }
}
