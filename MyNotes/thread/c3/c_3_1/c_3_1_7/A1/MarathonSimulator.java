package thread.c3.c_3_1.c_3_1_7.A1;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 10:27
 * \* Description:
 * \
 */
public class MarathonSimulator {

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        int personCount = 3;
        final CountDownLatch prepare = new CountDownLatch(personCount);
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch end = new CountDownLatch(personCount);
        final Queue<String> queue = new ConcurrentLinkedQueue<>();
        if(personCount < 3){
            System.out.println("参赛人数必须 > 2");
            return;
        }
        for(int i=1; i<=personCount; i++){
            final int personNumber = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    //模拟准备时间，使用随机数
                    try{
                        Thread.sleep(new Random(personNumber).nextInt(1000));
                    }catch(Exception e){}
                    System.out.println(personNumber+"号运动员准备完毕");
                    prepare.countDown();
                    try {
                        //等待开始跑的命令
                        start.await();
                    }catch (Exception e){}
                    System.out.println(personNumber+"号运动员开始跑");
                    long s = System.currentTimeMillis();
                    //模拟跑步时间，使用随机数
                    try{
                        Thread.sleep(new Random(personNumber).nextInt(10000));
                    }catch(Exception e){}
                    long c = System.currentTimeMillis() - s;
                    System.out.println(personNumber+"号运动员到达目的地，耗时："+c+"毫秒");

                    end.countDown();
                    queue.add(personNumber+"号");
                }
            });
        }
        System.out.println("有"+personCount+"名运动员参加本次的马拉松比赛");
        System.out.println("教练在等待运动员准备...\n");
        prepare.await();
        System.out.println("\n所有运动员准备完毕，教练开始喊：预备 --- 跑！");
        start.countDown();
        System.out.println("\n教练在等待所有的运动员跑完...\n");
        end.await();

        System.out.println("\n所有运动员都跑完了，开始颁奖啦：");
        System.out.println("冠军是："+queue.poll());
        System.out.println("亚军是："+queue.poll());
        System.out.println("季军是："+queue.poll());

        executorService.shutdown();
    }
}
