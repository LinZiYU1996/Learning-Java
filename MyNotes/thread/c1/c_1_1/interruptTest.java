package thread.c1.c_1_1;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 22:08
 * \* Description:
 * \
 */
public class interruptTest {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(
                ()->
                {
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("interrupt");
                    }
                }
        );


        thread.start();

        TimeUnit.MILLISECONDS.sleep(2);

        thread.interrupt();

    }
}
