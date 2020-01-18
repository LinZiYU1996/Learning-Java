package thread.c3.c_3_1.c_3_1_2.a5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 10:06
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {


//       多个生产者 一个 消费者
        MyStack myStack = new MyStack();

        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);

        P_thread p_thread_1 = new P_thread(p1);
        P_thread p_thread_2 = new P_thread(p2);
        P_thread p_thread_3 = new P_thread(p3);
        P_thread p_thread_4 = new P_thread(p4);
        P_thread p_thread_5 = new P_thread(p5);

        p_thread_1.start();
        p_thread_2.start();
        p_thread_3.start();
        p_thread_4.start();
        p_thread_5.start();

        C c1 = new C(myStack);
        C_thread c_thread = new C_thread(c1);
        c_thread.start();

    }
}
