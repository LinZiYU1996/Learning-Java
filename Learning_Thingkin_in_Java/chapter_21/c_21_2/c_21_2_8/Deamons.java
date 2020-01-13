package chapter_21.c_21_2.c_21_2_8;

import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 9:47
 * \* Description:
 * \
 */
public class Deamons {

    public static void main(String[] args) throws InterruptedException {

        Thread d = new Thread(new Daemon());

        d.setDaemon(true);


        d.start();

        System.out.println("d.isdae = " + d.isDaemon() + ".  ");

        TimeUnit.MILLISECONDS.sleep(100);

    }
}
