package thread.c1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 9:49
 * \* Description:
 * \
 */
public class interruptTest_4 implements Runnable{


    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Yes!!  I'm Interupted,  but I'm still running");
                return;
            } else {

            }
        }
    }

    public static void main(String[] args) {


//        处于被中断状态时，return 或 bread 中断线程


        Thread thread = new Thread(new interruptTest_4(), "testThread");
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println("Begin Interupt...");
        thread.interrupt();
        System.out.println("End Interupt...");
    }
}
