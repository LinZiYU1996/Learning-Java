package thread.c3.c_3_1.c_3_1_5.a1;

import java.util.concurrent.CountDownLatch;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 13:39
 * \* Description:
 * \
 */
public class volatileTest {


//    创建10个线程，每个线程执行1000次对i的自增操作，但最终结果i肯定不是10000

    private static volatile int i = 0;

    private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(10);

    private static void inc(){
        i++;
    }

    public static void main(String[] args) throws InterruptedException {

        for (int j = 0; j < 10; j++) {

            new Thread(
                    ()->
                    {
                        for (int x = 0;x<1000;x++){
                            inc();
                        }
                        COUNT_DOWN_LATCH.countDown();
                    }
            ).start();


        }

        COUNT_DOWN_LATCH.await();

        System.out.println(i);

    }
}
