package thread.c3.c_3_1.c_3_1_4.a2.b2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 22:05
 * \* Description:
 * \
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private boolean hasVal = false;

    public void set(){
        try {
            lock.lock();
            while (hasVal == true){
                condition.await();
            }
            System.out.println("打印*");
            hasVal=true;
            condition.signal();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void get(){
        try {
            lock.lock();
            while (hasVal==false){
                condition.await();
            }
            System.out.println("打印+");
            hasVal = false;
            condition.signal();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
