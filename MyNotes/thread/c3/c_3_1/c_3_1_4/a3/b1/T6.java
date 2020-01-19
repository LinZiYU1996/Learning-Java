package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:06
 * \* Description:
 * \
 */
public class T6 {

    public ReentrantLock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void waitM(){

        try {
            lock.lock();
            Thread.sleep(6000);
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        final T6 t6 = new T6();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                t6.waitM();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread.sleep(5000);
        System.out.println(t6.lock.hasQueuedThread(thread));
        System.out.println(t6.lock.hasQueuedThread(thread1));
        System.out.println(t6.lock.hasQueuedThreads());
    }

}
