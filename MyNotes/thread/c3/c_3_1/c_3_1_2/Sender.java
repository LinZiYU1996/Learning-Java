package thread.c3.c_3_1.c_3_1_2;

import java.util.concurrent.ThreadLocalRandom;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 21:55
 * \* Description:
 * \
 */
public class Sender implements Runnable{


//    创建一些随机数据包，这些数据包将通过网络以packet []数组的形式发送
//对于每个数据包，我们只是调用send（）
//然后我们用随机间隔调用Thread.sleep（）来模仿繁重的服务器端处理


    private Data data;

    // standard constructors


    public Sender(Data data) {
        this.data = data;
    }

    public void run() {
        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };

        for (String packet : packets) {
            data.send(packet);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
//                Log.error("Thread interrupted", e);
            }
        }
    }


}
