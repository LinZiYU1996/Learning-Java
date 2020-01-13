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
public class InnerRunnable1 {

//内部类使用Runnable接口

    private int countDown = 5;

    private Inner inner;

    private class Inner implements Runnable {

        Thread t;

        Inner(String name) {
            t = new Thread(this, name);
            t.start();
        }


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
            return t.getName() + ": " + countDown;
        }


    }


    public InnerRunnable1(String name) {
        inner = new Inner(name);
    }


}
