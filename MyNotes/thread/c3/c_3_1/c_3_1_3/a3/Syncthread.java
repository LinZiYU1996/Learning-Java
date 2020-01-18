package thread.c3.c_3_1.c_3_1_3.a3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:34
 * \* Description:
 * \
 */
public class Syncthread implements Runnable{

    private static int count;

    public Syncthread() {
        count = 0;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        test_without_synchronized(name);
    }

    public  synchronized void test_with_synchronized(String a) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + count++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public   void test_without_synchronized(String a) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + count++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
