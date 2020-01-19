package thread.c3.c_3_1.c_3_1_4.a3.b3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:44
 * \* Description:
 * \
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){

        try {

            try {

                lock.readLock().lock();
                System.out.println(" 获得读锁 " + Thread.currentThread().getName()
                + "   " +System.currentTimeMillis());

                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }


        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
