package thread.c3.c_3_1.c_3_1_4.a2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 21:59
 * \* Description:
 * \
 */
public class T1 {

    private static final int N = 3;
    private int count = 0;
    private int finishCount = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void doSomething() {
        for (int i=0; i<1000; i++) {
            synchronized (this) {
                count ++;
            }
        }
        lock.lock();
        finishCount ++;
        if (finishCount == N) {
            condition.signal();
        }
        lock.unlock();
    }

    public static void main(String[] args) {
        T1 test = new T1();
        for (int i=0; i<N; i++) {
            Runnable runnable = () -> test.doSomething();
            new Thread(runnable).start();
        }

        test.lock.lock();
        try {
            test.condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            test.lock.unlock();
        }

        System.out.println(test.count);
    }
}
