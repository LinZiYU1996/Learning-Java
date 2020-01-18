package thread.c3.c_3_1.c_3_1_3.a8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 15:06
 * \* Description:
 * \
 */
public class T {

    public static void main(String[] args) {

        AddOpertation addOpertation = new AddOpertation();

        Thread t1 = new Thread(addOpertation);
        t1.start();
        Thread t2 = new Thread(addOpertation);
        t2.start();
        Thread t3 = new Thread(addOpertation);
        t3.start();
        Thread t4 = new Thread(addOpertation);
        t4.start();
        Thread t5 = new Thread(addOpertation);
        t5.start();
//        System.out.println(addOpertation.getNum());
    }
}
