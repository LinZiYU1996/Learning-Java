package thread.c3.c_3_1.c_3_1_4.a3.b1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:16
 * \* Description:
 * \
 */
public class T8 {

    private ReentrantLock lock;

    public T8(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serM(){
        try {
            lock.lock();
            System.out.println("公平锁情况  " + lock.isFair());
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {


        final T8 t8 = new T8(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                t8.serM();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        final T8 t81 = new T8(false);

        runnable = new Runnable() {
            @Override
            public void run() {
                t81.serM();
            }
        };

        thread = new Thread(runnable);
        thread.start();
    }
}
