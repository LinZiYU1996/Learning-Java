package thread.c3.c_3_1.c_3_1_2;

import sun.rmi.runtime.Log;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 21:54
 * \* Description:
 * \
 */
public class Data {

    private String packet;

    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;

    public synchronized void send(String packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
//                Log.error("Thread interrupted", e);
            }
        }
        transfer = false;

        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
//                Log.error("Thread interrupted", e);
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }

//    变量数据包表示正在通过网络传输数据
//我们有一个布尔变量transfer -将发件人和接收器将使用同步：
//如果此变量为true，则Receiver应等待Sender发送消息
//如果它是false，那么Sender应该等待Receiver接收消息
//发送者使用send（）方法将数据发送到接收器：
//如果transfer为false，我们将在此线程上调用wait（）
//但是当它为true时，我们切换状态，设置我们的消息并调用notifyAll（）来唤醒其他线程以指定发生重大事件并且他们可以检查它们是否可以继续执行
//同样，Receiver将使用receive（）方法：
//如果transfer 设置为false的发件人，则会进行，否则我们将调用这个线程的wait（）
//满足条件时，我们切换状态，通知所有等待线程唤醒并返回Receiver的数据包


}
