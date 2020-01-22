package thread.c3.c_3_1.c_3_1_7.A5.A5_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/22
 * \* Time: 20:34
 * \* Description:
 * \
 */
public class Test_2 {


//    多线程操作HashMap

    public static void main(String[] args) {

        MyService myService = new MyService();

        Thread_1 thread_1 = new Thread_1(myService);

        Thread_2 thread_2 = new Thread_2(myService);

        thread_1.start();

        thread_2.start();

    }
}
