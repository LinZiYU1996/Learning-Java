package thread.c3.c_3_1.c_3_1_2;

import java.util.concurrent.ThreadLocalRandom;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 21:56
 * \* Description:
 * \
 */
public class Receiver implements Runnable{

    private Data load;

    // standard constructors


    public Receiver(Data load) {
        this.load = load;
    }

//    循环中调用load.receive（），直到我们得到最后一个“End”数据包
    public void run() {
        for(String receivedMessage = load.receive();  !"End".equals(receivedMessage); receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
//                Log.error("Thread interrupted", e);
            }
        }
    }


}
