package chapter_21.c_21_2.c_21_2_8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 9:45
 * \* Description:
 * \
 */
public class DaemonSpawn implements Runnable{

    @Override
    public void run() {
        while (true) {

            Thread.yield();

        }
    }
}
