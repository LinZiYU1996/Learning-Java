package better_write.Learn_Netty.My.Channel_Handler.P2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/13
 * \* Time: 9:49
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        ScheduledFuture<?> future = service.schedule(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("60");
                    }
                }
                ,10, TimeUnit.SECONDS);

        service.shutdown();

    }
}
