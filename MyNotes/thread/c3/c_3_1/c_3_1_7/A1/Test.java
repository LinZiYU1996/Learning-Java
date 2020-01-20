package thread.c3.c_3_1.c_3_1_7.A1;

import java.util.concurrent.CyclicBarrier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 11:14
 * \* Description:
 * \
 */
public class Test {


    public static void main(String[] args) {


        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

        MyService myService = new MyService(cyclicBarrier);

        AThread aThread1 = new AThread(myService);

        aThread1.setName("A");

        aThread1.start();

        AThread aThread2 = new AThread(myService);

        aThread2.setName("B");

        aThread2.start();

        AThread aThread3 = new AThread(myService);

        aThread3.setName("C");

        aThread3.start();

        AThread aThread4 = new AThread(myService);

        aThread4.setName("D");

        aThread4.start();

    }
}
