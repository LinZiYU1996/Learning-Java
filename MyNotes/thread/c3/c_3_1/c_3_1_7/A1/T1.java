package thread.c3.c_3_1.c_3_1_7.A1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 9:38
 * \* Description:
 * \
 */
public class T1 {

    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {

        Thread thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
                System.out.println("one is over");

            }
        });


        Thread thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }

                System.out.println("two is over");
            }
        });


        thread_1.start();
        thread_2.start();

        System.out.println("waiting all thread over.......");

        countDownLatch.await();

        System.out.println("over");


    }
}
