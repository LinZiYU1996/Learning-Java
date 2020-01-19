package thread.c3.c_3_1.c_3_1_4.a3.b3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 10:47
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        Service service = new Service();

        A a = new A(service);

        a.setName("A");

        B b = new B(service);

        b.setName("B");

        a.start();

        b.start();

    }
}
