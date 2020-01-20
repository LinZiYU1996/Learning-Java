package thread.c3.c_3_1.c_3_1_7.A1;

import java.util.concurrent.CountDownLatch;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 10:07
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        try {
            CountDownLatch comingTag = new CountDownLatch(10);

            CountDownLatch watiTag = new CountDownLatch(1);

            CountDownLatch waitRunTag = new CountDownLatch(10);

            CountDownLatch beginTag = new CountDownLatch(1);

            CountDownLatch endTag = new CountDownLatch(10);

            T2[] t2s = new T2[10];

            for (int i = 0; i < t2s.length; i++) {
                t2s[i] = new T2(comingTag,watiTag
                ,waitRunTag,beginTag,endTag);

                t2s[i].start();

            }

            System.out.println("裁判等待选手到来......");

            comingTag.await();

            System.out.println("所有运动员到了，准备5秒钟");

            Thread.sleep(5000);

            watiTag.countDown();

            System.out.println("各就各位");

            waitRunTag.await();

            Thread.sleep(2000);

            System.out.println("=================================");
            System.out.println("信号枪响啦");
            System.out.println("=================================");


            beginTag.countDown();

            endTag.await();

            System.out.println("比赛结束");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
