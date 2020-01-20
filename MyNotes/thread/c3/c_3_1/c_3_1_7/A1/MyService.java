package thread.c3.c_3_1.c_3_1_7.A1;

import chapter_14.c_14_2.demo.Man;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 11:09
 * \* Description:
 * \
 */
public class MyService {

    private CyclicBarrier cyclicBarrier;

    public MyService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void beginRun(){

        try {
            long val = (long) (Math.random()*1000);

            Thread.sleep(val);


//            getNumberWaiting方法的作用是获取有几个线程已经到达屏障点
            System.out.println(Thread.currentThread().getName()+"   "
            + System.currentTimeMillis() + "  开始跑第一阶段  "
            + (cyclicBarrier.getNumberWaiting() + 1));

            cyclicBarrier.await();

            System.out.println(Thread.currentThread().getName()+"   "
            + System.currentTimeMillis() + "   结束第一阶段的跑步  "
            + cyclicBarrier.getNumberWaiting());


            val = (long) (Math.random()*1000);

            Thread.sleep(val);

            System.out.println(Thread.currentThread().getName()+"    "
                    + System.currentTimeMillis() + "  开始跑第二阶段  "
                    + (cyclicBarrier.getNumberWaiting() + 1));

            cyclicBarrier.await();

            System.out.println(Thread.currentThread().getName()+"   "
                    + System.currentTimeMillis() + " 结束第二阶段的跑步  "
                    + cyclicBarrier.getNumberWaiting());

            System.out.println("");

        } catch (InterruptedException e){
            e.printStackTrace();
        } catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
