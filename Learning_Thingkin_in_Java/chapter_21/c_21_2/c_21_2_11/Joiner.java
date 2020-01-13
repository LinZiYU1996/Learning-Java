package chapter_21.c_21_2.c_21_2_11;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:28
 * \* Description:
 * \
 */
public class Joiner extends Thread{

//    Joiner线程将通过在Sleeper对象上调用join方法来等待Sleeper醒来

    private Sleeper sleeper;
    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }
    public void run() {
        try {
            sleeper.join();
        } catch(InterruptedException e) {
            print("Interrupted");
        }
        print(getName() + " join completed");
    }



}
