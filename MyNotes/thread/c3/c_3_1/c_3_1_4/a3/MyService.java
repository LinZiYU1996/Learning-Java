package thread.c3.c_3_1.c_3_1_4.a3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 22:12
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
                System.out.println("可能**连续");
                condition.await();
            }
            System.out.println("打印*");
            hasVal=true;
//            condition.signal();  可能会造成假死现象

            condition.signalAll();
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
                System.out.println("可能++连续");
                condition.await();
            }
            System.out.println("打印+");
            hasVal = false;
            //            condition.signal();  可能会造成假死现象

            condition.signalAll();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}
