package thread.c3.c_3_1.c_3_1_2.a2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:53
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");

        P p = new P(lock);

        C c = new C(lock);

        P_thread[] p_threads = new P_thread[2];

        C_thread[] c_threads = new C_thread[2];

        for (int i = 0; i < 2; i++) {
            p_threads[i] = new P_thread(p);
            p_threads[i].setName("生产者"+(i+1));
            c_threads[i] = new C_thread(c);
            c_threads[i].setName("消费者"+(i+1));
            p_threads[i].start();
            c_threads[i].start();
        }

        Thread.sleep(5000);

        Thread[] threads = new Thread[Thread.currentThread()
                .getThreadGroup().activeCount()];

        Thread.currentThread().getThreadGroup().enumerate(threads);

        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName()
            +"  "+threads[i].getState());
        }

    }
}
