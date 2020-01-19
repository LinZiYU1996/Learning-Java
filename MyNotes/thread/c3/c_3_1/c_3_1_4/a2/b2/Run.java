package thread.c3.c_3_1.c_3_1_4.a2.b2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 22:09
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        MyService myService = new MyService();

        Thread_1 thread_1 = new Thread_1(myService);

        thread_1.start();

        Thread_2 thread_2 = new Thread_2(myService);

        thread_2.start();


    }
}
