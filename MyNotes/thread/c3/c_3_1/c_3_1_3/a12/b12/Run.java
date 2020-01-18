package thread.c3.c_3_1.c_3_1_3.a12.b12;



/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 20:16
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {


        Service service = new Service();

        AThread aThread = new AThread(service);

        aThread.setName("A");

        aThread.start();

        BThread bThread = new BThread(service);

        bThread.setName("B");

        bThread.start();

    }
}
