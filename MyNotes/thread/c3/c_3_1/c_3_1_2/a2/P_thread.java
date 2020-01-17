package thread.c3.c_3_1.c_3_1_2.a2;



/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:52
 * \* Description:
 * \
 */
public class P_thread extends Thread{

    private P p;

    public P_thread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.setVal();
        }
    }


}
