package thread.c2.c_2_2.c_2_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 20:12
 * \* Description:
 * \
 */
public class T5 extends Thread{

//    使用异常捕获法停止多线程：
//
//当interrupted()检测到线程状态为停止的时候，会抛出异常，继而捕获这个异常来停止多线程


    @Override
    synchronized public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                //判断线程是否停止
                if (this.interrupted()) {
                    System.out.println("已经停止了");
                    //抛出异常
                    throw new InterruptedException();
                }
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("线程结束...");
        }
    }

    public static void main(String[] args) {
        T5 test = new T5();
        try {
            test.start();
            test.sleep(100);
            test.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

    }

}
