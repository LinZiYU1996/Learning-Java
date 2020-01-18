package thread.c3.c_3_1.c_3_1_3.a11;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 18:13
 * \* Description:
 * \
 */
public class T2 {
    public static void main(String[] args) {
        System.out.println("使用ClassName");
        SyncThread_1 syncThread = new SyncThread_1();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}


class ClassName {
    public void method() {
        synchronized(ClassName.class) {

        }
    }
}


class SyncThread_1 implements Runnable {
    private static int count;

    public SyncThread_1() {
        count = 0;
    }

    public static void method() {
        synchronized(SyncThread_1.class) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void run() {
        method();
    }
}
