package better_write.Learn_Netty.Chapter1.Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/10
 * \* Time: 9:33
 * \* Description:
 * \
 */
public class Demo1 {

    /*
     阻塞 I/O 示例
     */
    public static void main(String[] args) throws IOException {

        //创建一个新的 ServerSocket，用以
        //监听指定端口上的连接请求
        ServerSocket serverSocket = new ServerSocket(8866);

        //对 accept()方法的调
        //用将被阻塞，直到一
        //个连接建立
        Socket clientSocket = serverSocket.accept();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));

        PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);

        String request, response;

        while ((request = in.readLine()) != null) {
            if ("Done".equals(request)) {//如果客户端发送了“Done”，则退出处理循环
                break;
            }
            //请求被传递给服
            //务器的处理方法
//            response = processRequest(request);
//            out.println(response);
        }



    }
}
/*
Socket API 的基本模式之一。以下是最重要的几点。
ServerSocket 上的 accept()方法将会一直阻塞到一个连接建立 ，随后返回一个
新的 Socket 用于客户端和服务器之间的通信。该 ServerSocket 将继续监听传入的
连接。
BufferedReader 和 PrintWriter 都衍生自 Socket 的输入输出流 。前者从一个
字符输入流中读取文本，后者打印对象的格式化的表示到文本输出流。
readLine()方法将会阻塞，直到在 处一个由换行符或者回车符结尾的字符串被
读取。
客户端的请求已经被处理
 */
