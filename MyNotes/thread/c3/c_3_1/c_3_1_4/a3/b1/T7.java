package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.io.PushbackInputStream;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:11
 * \* Description:
 * \
 */
public class T7 {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void waitM(){
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyM(){
        try {
            lock.lock();
            System.out.println("有没有线程正在等待  "
            + lock.hasWaiters(condition)+
                    "线程数是多少"+
                    lock.getWaitQueueLength(condition));
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        final T7 t7= new T7();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                t7.waitM();
            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(3000);
        t7.notifyM();
    }

}
