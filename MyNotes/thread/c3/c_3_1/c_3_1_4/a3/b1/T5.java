package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:00
 * \* Description:
 * \
 */
public class T5 {

    private ReentrantLock lock  = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void waitme(){
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void notifyme(){
        try {
            lock.lock();
            System.out.println(" 有 " + lock.getWaitQueueLength(condition)
            +"  个线程正在等待  ");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        final T5 t5 = new T5();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                t5.waitme();
            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);

        t5.notifyme();

    }
}
