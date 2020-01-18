package thread.c3.c_3_1.c_3_1_3.a10;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 18:06
 * \* Description:
 * \
 */
public class T4 {

    public static void main(String[] args) {

        System.out.println("使用关键字synchronized");
        SyncThread_2 syncThread = new SyncThread_2();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();

    }
}


class SyncThread_2 implements Runnable {
    private static int count;
    public SyncThread_2() {
        count = 0;
    }
    public  void run() {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("线程名:"+Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int getCount() {
        return count;
    }

}
