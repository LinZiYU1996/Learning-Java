package thread.c3.c_3_1.c_3_1_3.a8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 15:12
 * \* Description:
 * \
 */
public class T1 implements Runnable{

    private static int num = 0;

    public  synchronized void add(){

                num++;

    }

    @Override
    public void run() {
        add();
    }

    public static void main(String[] args) {

        T1 t1 = new T1();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(t1);
            t.start();
        }
        System.out.println(num);
//        service.shutdown();



    }
}
