package thread.c3.c_3_1.c_3_1_7.A2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 11:39
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

        C c = new C(service);

        c.setName("C");

        a.start();
        b.start();
        c.start();




    }
}
