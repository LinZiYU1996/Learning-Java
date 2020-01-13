package chapter_21.c_21_2.c_21_2_11;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:26
 * \* Description:
 * \
 */
public class Sleeper extends Thread{

//    Sleeper要休眠一段时间  通过构造函数的参数决定时间
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }


    public void run() {
        try {
            sleep(duration);
        } catch(InterruptedException e) {
            print(getName() + " was interrupted. " +
                    "isInterrupted(): " + isInterrupted());
            return;
        }
        print(getName() + " has awakened");
    }


}
