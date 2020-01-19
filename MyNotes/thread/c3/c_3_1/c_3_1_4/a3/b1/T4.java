package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 9:46
 * \* Description:
 * \
 */
public class T4 {

    public ReentrantLock lock = new ReentrantLock();

    public void m1(){
        try {
            lock.lock();
            System.out.println("name=  " + Thread.currentThread().getName()
            +"  进入方法  ");
            Thread.sleep(6000);
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        final T4 t4 = new T4();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                t4.m1();
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
        System.out.println("线程数量  " + t4.lock.getQueueLength()
        +"在等待获取锁");
    }
}
