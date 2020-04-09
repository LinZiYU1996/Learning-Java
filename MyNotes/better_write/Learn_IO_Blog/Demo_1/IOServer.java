//package better_write.Learn_IO_Blog.Demo_1;
//
//import sun.misc.IOUtils;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.InetSocketAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.logging.Logger;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* User: LinZiYu
// * \* Date: 2020/4/8
// * \* Time: 9:50
// * \* Description:
// * \
// */
//public class IOServer {
//
//    /*
//    单线程逐个处理所有请求
//    使用阻塞I/O的服务器，一般使用循环，逐个接受连接请求并读取数据，然后处理下一个请求。
//     */
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(IOServer.class);
//
//    public static void main(String[] args) {
//        ServerSocket serverSocket = null;
//        try {
//            serverSocket = new ServerSocket();
//            serverSocket.bind(new InetSocketAddress(2345));
//        } catch (IOException ex) {
//            LOGGER.error("Listen failed", ex);
//            return;
//        }
//        try{
//            while(true) {
//                Socket socket = serverSocket.accept();
//                InputStream inputstream = socket.getInputStream();
//                LOGGER.info("Received message {}", IOUtils.toString(inputstream));
//                IOUtils.closeQuietly(inputstream);
//            }
//        } catch(IOException ex) {
//            IOUtils.closeQuietly(serverSocket);
//            LOGGER.error("Read message failed", ex);
//        }
//    }
//}
