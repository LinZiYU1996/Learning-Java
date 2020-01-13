package chapter_21.c_21_2.c_21_2_9;

import java.util.concurrent.TimeUnit;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:18
 * \* Description:
 * \
 */
public class InnerRunnable2 {

//    匿名内部类使用Runnable接口

    private int countDown = 5;

    private Thread t;

    public InnerRunnable2(String name) {

        t = new Thread(new Runnable() {
            public void run() {

                try {

                    while(true) {

                        print(this);
                        if(--countDown == 0) return;
                        TimeUnit.MILLISECONDS.sleep(10);

                    }
                } catch(InterruptedException e) {
                    print("sleep() interrupted");
                }
            }

            public String toString() {
                return Thread.currentThread().getName() +
                        ": " + countDown;
            }


        }, name);

        t.start();

    }
}
