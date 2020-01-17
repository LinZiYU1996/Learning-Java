package thread.c3.c_3_1.c_3_1_2.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:37
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

//        一个生产者 一个消费者
//        set get交替运行



        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        P_thread p_thread = new P_thread(p);
        C_thread c_thread = new C_thread(c);
        p_thread.start();
        c_thread.start();

    }
}
