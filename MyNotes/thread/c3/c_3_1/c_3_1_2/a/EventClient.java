package thread.c3.c_3_1.c_3_1_2.a;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:21
 * \* Description:
 * \
 */
public class EventClient {

    public static void main(String[] args) {

        final EventQueue eventQueue = new EventQueue();

        new Thread(
                ()->
                {
                    for (;;){
                        eventQueue.offer(new EventQueue.Event());
                    }
                },"Producer"
        ).start();


        new Thread(
                ()->
                {
                    for (;;){
                        eventQueue.take();
                        try {
                            TimeUnit.MILLISECONDS.sleep(10);
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                },"Consumer"
        ).start();
    }
}
