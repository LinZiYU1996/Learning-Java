package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 22:29
 * \* Description:
 * \
 */
public class T1 {

    private Lock lock = new ReentrantLock(true);

    public void testMethod()
    {
        try
        {
            lock.lock();
            System.out.println("ThreadName" + Thread.currentThread().getName() + "获得锁");
        }
        finally
        {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final T1 td = new T1();
        Runnable runnable = new Runnable()
        {
            public void run()
            {
                System.out.println("◆线程" + Thread.currentThread().getName() + "运行了");
                td.testMethod();
            }
        };
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++)
            threads[i] = new Thread(runnable);
        for (int i = 0; i < 5; i++)
            threads[i].start();

    }
}
