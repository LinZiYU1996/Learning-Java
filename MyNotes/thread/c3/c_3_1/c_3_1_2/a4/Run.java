package thread.c3.c_3_1.c_3_1_2.a4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 9:59
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        P p = new P(myStack);

        C c1 = new C(myStack);

        C c2 = new C(myStack);

        C c3 = new C(myStack);

        C c4 = new C(myStack);

        C c5 = new C(myStack);

        P_thread p_thread = new P_thread(p);

        p_thread.start();

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
