package thread.c3.c_3_1.c_3_1_7.A2;

import java.util.concurrent.Semaphore;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 11:37
 * \* Description:
 * \
 */
public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void test(){

        try {
            semaphore.acquire();

            System.out.println(Thread.currentThread().getName()
            +"  开始  " + System.currentTimeMillis());

            Thread.sleep(5000);

            System.out.println(Thread.currentThread().getName()
            +" 结束 " + System.currentTimeMillis());

            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
