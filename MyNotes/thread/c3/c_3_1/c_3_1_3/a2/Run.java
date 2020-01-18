package thread.c3.c_3_1.c_3_1_3.a2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:27
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) {

        SelfPrivateNum selfPrivateNum = new SelfPrivateNum();

        ThreadA a = new ThreadA(selfPrivateNum);

        a.start();

        ThreadB b = new ThreadB(selfPrivateNum);

        b.start();

    }
}
