package thread.c3.c_3_1.c_3_1_7.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/20
 * \* Time: 11:13
 * \* Description:
 * \
 */
public class AThread extends Thread{

    private MyService myService;

    public AThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.beginRun();
    }
}
