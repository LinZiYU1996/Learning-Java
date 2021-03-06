package thread.c3.c_3_1.c_3_1_7.A2;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 11:53
 * \* Description:
 * \
 */
public class SemaphoreThread extends Thread{

    private String name;
    private Semaphore semaphore;

    public SemaphoreThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        if (semaphore.availablePermits() <= 0) {
            System.out.println(name + "等位中。。。");
        }
        try {
            semaphore.acquire();
            System.out.println(name + "开始就餐了。。");
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "吃完了。。");
        semaphore.release();
    }

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i <= 3; i++) {
            new SemaphoreThread("第" + i + "个人", semaphore).start();
        }

    }
}
