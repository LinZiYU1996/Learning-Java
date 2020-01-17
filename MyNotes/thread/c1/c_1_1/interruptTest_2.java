package thread.c1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 9:45
 * \* Description:
 * \
 */
public class interruptTest_2 {

    public static void main(String[] args) {

        System.out.println("程序开始运行");
        long time1 = System.currentTimeMillis();

        final Thread t1 = new Thread(){
            @Override
            public void run(){
                System.out.println("线程t1开始");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("t1线程被中断！");
                    //return;//如果这里return，则t1将不再往下执行
                    e.printStackTrace();
                }
                System.out.println("线程t1结束");
            }
        };


        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程t2开始");
                try {
                    //模拟t2业务进行
                    Thread.sleep(3000);
                    //此时t2需要中断t1
                    t1.interrupt();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程t2结束");
            }
        });
        t2.start();


    }
}
