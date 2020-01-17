package thread.c1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 9:48
 * \* Description:
 * \
 */
public class interruptTest_3 implements Runnable{

    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Yes!!  I'm Interupted,  but I'm still running");
            } else {

            }
        }
//        System.out.println("Oh, myGod!");
    }

    public static void main(String[] args) {

//        问题：虽然是被中断状态，但实际并未中断


        Thread thread = new Thread(new interruptTest_3(), "testThread");
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
