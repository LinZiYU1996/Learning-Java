package chapter_21.c_21_2.c_21_2_5;

import chapter_21.c_21_2.c_21_2_1.LisstOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:22
 * \* Description:
 * \
 */
public class SleepingTask extends LisstOff {

//   影响任务之一的简单方法是调用 sleep()  这将使任务中止执行给定的时间

    @Override
    public void run() {

        while (countDown-- > 0) {

            System.out.println(status());

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        ExecutorService ex = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {

            ex.execute(new SleepingTask());

        }

        ex.shutdown();


    }
}
