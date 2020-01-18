package thread.c3.c_3_1.c_3_1_3.a11;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 18:30
 * \* Description:
 * \
 */
public class ThreadA extends Thread{

    private PublicVal publicVal;

    public ThreadA(PublicVal publicVal) {
        this.publicVal = publicVal;
    }

    @Override
    public void run() {
        super.run();
        publicVal.setVal("B","BB");
    }
}
