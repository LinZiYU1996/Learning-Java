package thread.c3.c_3_1.c_3_1_3.a9;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 15:28
 * \* Description:
 * \
 */
public class T1 implements Runnable{

    private int index = 1;

    private final static int MAX = 500;

    @Override
    public void run() {
        while (index<=MAX){
            System.out.println(Thread.currentThread()+"号码是  " + (index++));
        }
    }

    public static void main(String[] args) {

        final T1 t1 = new T1();

        Thread thread1 = new Thread(t1,"一号");
        Thread thread2 = new Thread(t1,"二号");
        Thread thread3 = new Thread(t1,"三号");
        Thread thread4 = new Thread(t1,"四号");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
