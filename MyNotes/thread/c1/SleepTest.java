package thread.c1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 21:22
 * \* Description:
 * \
 */
public class SleepTest {

  private static final Lock LOCK = new ReentrantLock();

    public static void main(String[] args) {

        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                    LOCK.lock();
                System.out.println("A sleep");

                try {
                    Thread.sleep(10000);
                    System.out.println("A awaked");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    LOCK.unlock();
                }
            }
        });


        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {

                LOCK.lock();
                System.out.println("B sleep");

                try {
                    Thread.sleep(10000);
                    System.out.println("B asw");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    LOCK.unlock();
                }
            }
        });


        a.start();
        b.start();
    }
}
