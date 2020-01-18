package thread.c3.c_3_1.c_3_1_3.a6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:52
 * \* Description:
 * \
 */
public class Main {

    private static int num = 0;

    public static void main(String[] args) {

        T1 t1 = new T1(num);

        T2 t2 = new T2(num);

        t1.start();
        t2.start();

        System.out.println(num);

    }
}
