package thread.c3.c_3_1.c_3_1_7.A1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 10:37
 * \* Description:
 * \
 */
public class T3 extends Thread{

    private CyclicBarrier cyclicBarrier;

    public T3(CyclicBarrier cyclicBarrier) {
        super();
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()
            +"   到了 "
            +System.currentTimeMillis());
            cyclicBarrier.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        } catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("全部到了");
            }
        });

        T3[] t3s = new T3[5];

        for (int i = 0; i < t3s.length; i++) {
            t3s[i] = new T3(cyclicBarrier);
        }

        for (int i = 0; i < t3s.length; i++) {
            t3s[i].start();
        }
    }
}
