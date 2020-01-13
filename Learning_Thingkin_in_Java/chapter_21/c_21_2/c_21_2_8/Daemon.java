package chapter_21.c_21_2.c_21_2_8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 9:44
 * \* Description:
 * \
 */
public class Daemon implements Runnable{

    private Thread[] ts = new Thread[10];

    @Override
    public void run() {

        for (int i = 0; i < ts.length; i++) {

            ts[i] = new Thread(new DaemonSpawn());

            ts[i].start();

            System.out.println("DaemonSpawn   " + i + "  started");

        }

        for (int i = 0; i < ts.length; i++) {


            System.out.println("t[  " + i + "].isDae  =" + ts[i].isDaemon() + "  ");
        }

        while (true) {
            Thread.yield();
        }

    }
}
