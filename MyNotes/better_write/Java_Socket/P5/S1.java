package better_write.Java_Socket.P5;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/6
 * \* Time: 20:48
 * \* Description:
 * \
 */
public class S1 {


    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8045);
        System.out.println(serverSocket.getSoTimeout());
        /*
        设置超时时间为4秒 如果4s内没有客户端连接时服务端是否会出现超时异常
         */
        serverSocket.setSoTimeout(4000);
        System.out.println(serverSocket.getSoTimeout());
        System.out.println("");

        System.out.println("begin " + System.currentTimeMillis());
        serverSocket.accept();
        System.out.println("end"+System.currentTimeMillis());


    }
}
