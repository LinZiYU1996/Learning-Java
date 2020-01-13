package chapter_21.c_21_2.c_21_2_8;

import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:34
 * \* Description:
 * \
 */
public class SimpleDaemons implements Runnable{


//    后台（daemon）线程   指在程序运行的时候在后台提供一种通用服务的线程
//    并且它并不属于程序中不可或缺的部分

    @Override
    public void run() {

        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);

                System.out.println(Thread.currentThread() + "  " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }


    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            Thread daemon = new Thread(new SimpleDaemons());

            daemon.setDaemon(true);

            daemon.start();

        }

        System.out.println("all dae is start");

        TimeUnit.MILLISECONDS.sleep(175);



    }
}
