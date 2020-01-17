package thread.c2.c_2_2.c_2_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 17:21
 * \* Description:
 * \
 */
public class T3 {

    private static class Thread1 extends Thread{
        @Override
        public void run() {

            try {
                int val = (int) (Math.random()*10000);
                System.out.println(val);
                Thread.sleep(val);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {


        Thread1 thread1 = new Thread1();
        thread1.start();
        try {
            thread1.join();
            System.out.println("我要等Thread1执行完毕后再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
