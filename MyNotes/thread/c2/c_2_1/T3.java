package thread.c2.c_2_1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 10:24
 * \* Description:
 * \
 */
public class T3 extends Thread{


//    处理不支持中断的线程中断的常用方法
//如果一个线程由于同步记性IO操作导致阻塞，中断请求不会抛出InterruptedException，该如何中断此线程呢？

    public static final int BUF_SIZE = 512;

    Socket socket;
    InputStream in;

    public T3 (Socket socket) throws IOException {
        this.socket = socket;
        this.in = socket.getInputStream();
    }


//    通过改写了Thread.interrupt方法，当调用interrupt方法时，会关闭socket，如果此时read方法阻塞，那么会抛出IOException异常，此时线程任务也就结束了。

    @Override
    public void interrupt() {
        try {
            socket.close();
        } catch (IOException e) {

        } finally {
            super.interrupt();
        }
    }

    @Override
    public void run() {
        try {
            byte[] buf = new byte[BUF_SIZE];
            while (true) {
                int count = in.read(buf);
                if (count < 0) {
                    break;
                } else if (count > 0) {

                }
            }
        } catch (IOException e) {

        }

    }
}
