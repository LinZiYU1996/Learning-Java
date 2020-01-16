package thread.c1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 21:31
 * \* Description:
 * \
 */
public class SleepTest2 {

    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {


                try {
                    System.out.println("sleep");
                    Thread.sleep(10000);
                    System.out.println("asw");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

        thread.start();

//        主线程休眠
        Thread.sleep(2000);

//       主线程中断子线程
        thread.isInterrupted();

    }
}
