package thread.c3.c_3_1.c_3_1_3.a10;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 15:54
 * \* Description:
 * \
 */
public class T2 {

    //    一个线程访问一个对象中的synchronized(this)同步代码块时，其他试图访问该对象的线程将被阻塞。


    public static void main(String[] args) {
        System.out.println("使用关键字synchronized");
//        SyncThread syncThread = new SyncThread();

//        这边创建了两个不同的SyncThread_1对象
        Thread thread1 = new Thread(new SyncThread_1(), "SyncThread1");
        Thread thread2 = new Thread(new SyncThread_1(), "SyncThread2");
        thread1.start();
        thread2.start();
    }
}
class SyncThread_1 implements Runnable {
    private static int count;
    public SyncThread_1() {
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
