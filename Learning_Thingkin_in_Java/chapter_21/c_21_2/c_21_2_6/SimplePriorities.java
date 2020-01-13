package chapter_21.c_21_2.c_21_2_6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:26
 * \* Description:
 * \
 */
public class SimplePriorities implements Runnable{

//    线程的优先级

//    调度器倾向于让优先权最高的线程先执行

//    试图操纵线程优先级是一种错误

//    下面是演示优先级的例子

    private int countDown = 5;

    private volatile double d;

    private int priority;

    public SimplePriorities(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + "SimplePriorities{" +
                "countDown=" + countDown +
                ", d=" + d +
                ", priority=" + priority +
                '}';
    }

    @Override
    public void run() {

        Thread.currentThread().setPriority(priority);

        while (true) {
            for (int i = 0; i < 10000; i++) {

                d += (Math.PI + Math.E) / i;

                if (i % 1000 == 0) {
                    Thread.yield();
                }

                System.out.println(this);

                if (--countDown == 0) {
                    return;
                }
            }
        }

    }


    public static void main(String[] args) {

        ExecutorService ex = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {

            ex.execute(
                    new SimplePriorities(Thread.MIN_PRIORITY)
            );

            ex.execute(
                    new SimplePriorities(Thread.MAX_PRIORITY)
            );

            ex.shutdown();

        }


    }
}
