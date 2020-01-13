package chapter_21.c_21_2.c_21_2_9;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:19
 * \* Description:
 * \
 */
public class ThreadMethod {


//    如何在方法内部创建线程


    private int countDown = 5;

    private Thread t;

    private String name;

    public ThreadMethod(String name) {

        this.name = name;

    }

    public void runTask() {

        if(t == null) {

            t = new Thread(name) {

                public void run() {

                    try {

                        while(true) {

                            print(this);
                            if(--countDown == 0) return;
                            sleep(10);

                        }
                    } catch(InterruptedException e) {
                        print("sleep() interrupted");
                    }
                }


                public String toString() {
                    return getName() + ": " + countDown;
                }


            };

            t.start();

        }
    }


}
