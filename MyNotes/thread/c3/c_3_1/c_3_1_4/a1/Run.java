package thread.c3.c_3_1.c_3_1_4.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 21:28
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        MyService myService = new MyService();

        MyThread myThread1 = new MyThread(myService);
        MyThread myThread2 = new MyThread(myService);
        MyThread myThread3 = new MyThread(myService);
        MyThread myThread4 = new MyThread(myService);
        MyThread myThread5 = new MyThread(myService);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();

    }
}
