package thread.c3.c_3_1.c_3_1_4.a2.b2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 22:08
 * \* Description:
 * \
 */
public class Thread_1 extends Thread{

    private MyService myService;

    public Thread_1(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            myService.set();
        }
    }
}
