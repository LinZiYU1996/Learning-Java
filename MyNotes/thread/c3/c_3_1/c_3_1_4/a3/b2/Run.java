package thread.c3.c_3_1.c_3_1_4.a3.b2;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:31
 * \* Description:
 * \
 */
public class Run {

    volatile private static int nextPrintWho = 1;

    private static ReentrantLock lock = new ReentrantLock();

    final private static Condition CONDITIONA = lock.newCondition();

    final private static Condition CONDITIONB = lock.newCondition();

    final private static Condition CONDITIONC = lock.newCondition();

    public static void main(String[] args) {

        Thread threadA = new Thread(){

            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho!=1){
                        CONDITIONA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("  TA  " + (i+1));
                    }
                    nextPrintWho = 2;
                    CONDITIONB.signalAll();
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadB = new Thread(){


            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho!=2){
                        CONDITIONB.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("   TB   " + (i+1));
                    }
                    nextPrintWho = 3;
                    CONDITIONC.signalAll();
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };


        Thread threadC = new Thread(){


            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho!=3){
                        CONDITIONB.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("  TC   " + (i+1));
                    }
                    nextPrintWho = 1;
                    CONDITIONC.signalAll();
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };


        Thread[] a1 = new Thread[5];
        Thread[] a2 = new Thread[5];
        Thread[] a3 = new Thread[5];

        for (int i = 0; i < 5; i++) {
            a1[i] = new Thread(threadA);
            a2[i] = new Thread(threadB);
            a3[i] = new Thread(threadC);
            a1[i].start();
            a2[i].start();
            a3[i].start();
        }

    }
}
