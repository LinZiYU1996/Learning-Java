package thread.c3.c_3_1.c_3_1_4.a2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 21:45
 * \* Description:
 * \
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("等待时间为  "+System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("通知时间为  "+System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
