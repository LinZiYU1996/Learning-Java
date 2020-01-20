package thread.c3.c_3_1.c_3_1_7.A3;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 14:55
 * \* Description:
 * \
 */
public class Test {

    private final static NonReentrantLock lock = new NonReentrantLock();

    private final static Condition notFull = lock.newCondition();

    private final static Condition notEmpty = lock.newCondition();

    private final static Queue<String> QUEUE = new LinkedBlockingQueue<>();

    private final static int queueSize = 10;

    public static void main(String[] args) {


        Thread pro = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {


                    while (QUEUE.size() == queueSize) {
                        notEmpty.await();
                    }

                    QUEUE.add("sss");

                    notFull.signalAll();



                } catch (Exception e){
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });


        Thread con = new Thread(new Runnable() {
            @Override
            public void run() {

                lock.lock();

                try {


                    while (QUEUE.size() == 0){
                        notFull.await();
                    }

                    String s = QUEUE.poll();

                    notEmpty.signalAll();

                } catch (Exception e){
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        });

        pro.start();

        con.start();

    }
}
