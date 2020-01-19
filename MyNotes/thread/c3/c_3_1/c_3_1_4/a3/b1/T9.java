package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:24
 * \* Description:
 * \
 */
public class T9 {

    private ReentrantLock lock;

    public T9(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serM(){
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        final T9 t9 = new T9(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                t9.serM();
            }
        } ;

        Thread thread = new Thread(runnable);
        thread.start();


    }
}
