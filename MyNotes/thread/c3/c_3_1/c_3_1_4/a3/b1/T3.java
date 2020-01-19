package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 22:36
 * \* Description:
 * \
 */
public class T3 {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println(" serviceMethod1 getHoldCount  " + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println(" serviceMethod2 getHoldCount " +lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        T3 t3 = new T3();
        t3.serviceMethod1();

    }
}
