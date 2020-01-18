package thread.c3.c_3_1.c_3_1_3.a13;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 20:25
 * \* Description:
 * \
 */
public class Run {


//    同步方法容易造成死循环


    public static void main(String[] args) {

        Service service = new Service();

        Change_Service change_service = new Change_Service();

        Thread_A a = new Thread_A(change_service);

        a.start();

        Thread_B b = new Thread_B(change_service);

        b.start();

    }
}
