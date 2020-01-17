package thread.c2.c_2_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 13:35
 * \* Description:
 * \
 */
public class T4 {

//  主线程调用one的join方法阻塞自己等待one执行完毕
//    待two休眠1s后调用主线程的interrupt方法设置主线程的中断标志
//
    public static void main(String[] args) {

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("one begin");

                for (;;){

                }
            }
        });


        final Thread mainthread = Thread.currentThread();

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                mainthread.interrupt();
            }
        });

        one.start();
        two.start();


        try {
            one.join();
        } catch (InterruptedException e) {
            System.out.println("main" + e);
        }

    }
}
