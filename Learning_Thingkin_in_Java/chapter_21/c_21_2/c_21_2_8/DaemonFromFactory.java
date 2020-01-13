package chapter_21.c_21_2.c_21_2_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 9:54
 * \* Description:
 * \
 */
public class DaemonFromFactory implements Runnable{


    @Override
    public void run() {

        while (true) {

            try {
                TimeUnit.MILLISECONDS.sleep(100);

                System.out.println(Thread.currentThread() + "   " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool(new DaemonThreadFactory());

        for (int i = 0; i < 10; i++) {

            service.execute(new DaemonFromFactory());

        }

        System.out.println("ALl dae is start");

        TimeUnit.MILLISECONDS.sleep(500);


    }
}
