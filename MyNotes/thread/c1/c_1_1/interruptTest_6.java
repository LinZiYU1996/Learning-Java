package thread.c1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 9:51
 * \* Description:
 * \
 */
public class interruptTest_6 implements Runnable{


    private volatile static boolean on = false;

    @Override
    public void run() {
        while (!on) {
            try {
                System.out.println("begin Sleep");
                Thread.sleep(10000000);
                System.out.println("end Sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Oh, myGod!");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new interruptTest_6(), "testThread");
        thread.start();
        try {
            System.out.println("main Begin sleep");
            Thread.sleep(5000);
            System.out.println("main End sleep");
        } catch (InterruptedException e) {

        }
        interruptTest_6.on = true;
        System.out.println("Begin Interupt...");
        thread.interrupt();
        System.out.println("End Interupt...");
    }


}
