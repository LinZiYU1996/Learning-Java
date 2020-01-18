package thread.c3.c_3_1.c_3_1_2.a6;




/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 10:13
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {


//      多消费者 多生产者


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

        C c2 = new C(myStack);

        C c3 = new C(myStack);

        C c4 = new C(myStack);

        C c5 = new C(myStack);


        C_thread c_thread1 = new C_thread(c1);

        C_thread c_thread2= new C_thread(c2);

        C_thread c_thread3 = new C_thread(c3);

        C_thread c_thread4 = new C_thread(c4);

        C_thread c_thread5 = new C_thread(c5);

        c_thread1.start();
        c_thread2.start();
        c_thread3.start();
        c_thread4.start();
        c_thread5.start();

    }
}
