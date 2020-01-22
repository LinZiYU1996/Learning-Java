package thread.c3.c_3_1.c_3_1_7.A5.A5_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/22
 * \* Time: 20:38
 * \* Description:
 * \
 */
public class T_2 extends Thread{

    private MyService myService;

    public T_2(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {

        for (int i = 0; i < 50000; i++) {
            myService.concurrentHashMap.put("Thread_2 "+(i+1),"Thread_2"+i+1);
            System.out.println("Thread_2 "+(i+1));
        }
    }
}
