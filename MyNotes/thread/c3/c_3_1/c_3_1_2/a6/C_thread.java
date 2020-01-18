package thread.c3.c_3_1.c_3_1_2.a6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 9:54
 * \* Description:
 * \
 */
public class C_thread extends Thread{

    private C c;

    public C_thread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.popService();
        }
    }
}
