package thread.c2.c_2_2.c_2_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 20:11
 * \* Description:
 * \
 */
public class T4 extends Thread{


//    interrupt()方法仅仅将线程设置为中断状态，但是并不会去停止线程，
//    返回true说明线程的中断状态已经被设置了。


    @Override
    synchronized public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            //判断线程是否停止
            if (this.interrupted()){
                System.out.println("已经停止了");
                break;
            }
            System.out.println(i);
        }
        System.out.println("虽然线程已经停止了，但是还是会跳出for循环继续向下执行的");
    }

    public static void main(String[] args) {
        T4 test = new T4();
        try {
            test.start();
            test.sleep(50);
            //线程停止
            test.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

    }


}
