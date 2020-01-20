package thread.c3.c_3_1.c_3_1_7.A1;

import java.util.concurrent.CountDownLatch;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 10:01
 * \* Description:
 * \
 */
public class T2 extends Thread{


    private CountDownLatch comingTag;

    private CountDownLatch watiTag;

    private CountDownLatch waitRunTag;

    private CountDownLatch beginTag;

    private CountDownLatch endTag;

    public T2(CountDownLatch comingTag, CountDownLatch watiTag, CountDownLatch waitRunTag, CountDownLatch beginTag, CountDownLatch endTag) {
        this.comingTag = comingTag;
        this.watiTag = watiTag;
        this.waitRunTag = waitRunTag;
        this.beginTag = beginTag;
        this.endTag = endTag;
    }


    @Override
    public void run() {
        try {
            System.out.println("运动员以不同速度赶往起跑地点....");

            Thread.sleep(5000);

            System.out.println(Thread.currentThread().getName()
            +"  到达起跑点了 ");

            comingTag.countDown();

            System.out.println("等待裁判开始进行比赛");

            watiTag.await();

            System.out.println("各就各位");

            Thread.sleep(1000);

            waitRunTag.countDown();

            beginTag.await();

            System.out.println(Thread.currentThread().getName()
            +"  运动员起跑啦   ");

            Thread.sleep(6000);

            endTag.countDown();;

            System.out.println(Thread.currentThread().getName()
            + "  到达终点了");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
