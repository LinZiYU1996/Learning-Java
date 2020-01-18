package thread.c3.c_3_1.c_3_1_3.a11;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 18:30
 * \* Description:
 * \
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        PublicVal publicVal = new PublicVal();

        ThreadA threadA = new ThreadA(publicVal);

        threadA.start();

        Thread.sleep(200);

        publicVal.getVal();
    }
}
