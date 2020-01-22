package thread.c3.c_3_1.c_3_1_7.A5.A5_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/22
 * \* Time: 20:39
 * \* Description:
 * \
 */
public class Test {

    public static void main(String[] args) {

        MyService myService = new MyService();

        T_1 t_1 = new T_1(myService);

        T_2 t_2 = new T_2(myService);

        t_1.start();

        t_2.start();


    }
}
