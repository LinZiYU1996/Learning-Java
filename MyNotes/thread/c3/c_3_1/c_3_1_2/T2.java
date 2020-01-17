package thread.c3.c_3_1.c_3_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:03
 * \* Description:
 * \
 */
public class T2 implements Runnable{


//    交替打印 1 2
    private int num;
    private Object lock;

    public T2(int num, Object lock) {
        super();
        this.num = num;
        this.lock = lock;
    }

    public void run() {
        try {
            while(true){
                synchronized(lock){
                    lock.notifyAll();
                    lock.wait();

                    System.out.println(num);
                }
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        final Object lock = new Object();

        Thread thread1 = new Thread(new T2(1,lock));
        Thread thread2 = new Thread(new T2(2, lock));

        thread1.start();
        thread2.start();
    }

}
