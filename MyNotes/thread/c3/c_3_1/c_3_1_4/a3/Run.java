package thread.c3.c_3_1.c_3_1_4.a3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 22:14
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        MyService myService = new MyService();

        Thread_1[] thread_1s = new Thread_1[10];

        Thread_2[] thread_2s = new Thread_2[10];

        for (int i = 0; i < 10; i++) {
            thread_1s[i] = new Thread_1(myService);
            thread_2s[i] = new Thread_2(myService);
            thread_1s[i].start();
            thread_2s[i].start();

        }

    }
}
