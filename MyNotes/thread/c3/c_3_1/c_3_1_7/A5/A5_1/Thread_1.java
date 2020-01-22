package thread.c3.c_3_1.c_3_1_7.A5.A5_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/22
 * \* Time: 20:31
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
        for (int i = 0; i < 50000; i++) {
            myService.map.put("Thread_1 "+(i+1),"Thread_1"+i+1);
            System.out.println("Thread_1 "+(i+1));
        }
    }
}
