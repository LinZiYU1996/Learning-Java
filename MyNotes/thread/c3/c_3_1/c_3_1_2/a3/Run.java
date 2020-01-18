package thread.c3.c_3_1.c_3_1_2.a3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 9:55
 * \* Description:
 * \
 */
public class Run {


//    生产者 消费者  容器size不会大于1
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        P_thread p_thread = new P_thread(p);
        C_thread c_thread = new C_thread(c);
        p_thread.start();
        c_thread.start();

    }
}
