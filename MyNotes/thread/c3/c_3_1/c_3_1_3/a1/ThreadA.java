package thread.c3.c_3_1.c_3_1_3.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:22
 * \* Description:
 * \
 */
public class ThreadA extends Thread{

    private SelfPrivateNum selfPrivateNum;

    public ThreadA(SelfPrivateNum selfPrivateNum) {
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        selfPrivateNum.add("a");
    }
}
