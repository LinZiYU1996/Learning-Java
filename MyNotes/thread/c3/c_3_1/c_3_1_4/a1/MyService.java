package thread.c3.c_3_1.c_3_1_4.a1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 21:25
 * \* Description:
 * \
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethod(){

//        获取锁
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread name  "+Thread.currentThread().getName()
            +" ( "+ (i+1));
        }
        System.out.println("");

//        释放锁
        lock.unlock();
    }
}
