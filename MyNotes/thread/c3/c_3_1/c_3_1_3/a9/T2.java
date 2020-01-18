package thread.c3.c_3_1.c_3_1_3.a9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 15:33
 * \* Description:
 * \
 */
public class T2 implements Runnable{

    private static List<String> list = new ArrayList<>();


    public synchronized void add(){
        for (int i = 0; i < 100; i++) {
            list.add("s");
        }

    }

    public int getSize(){
        return list.size();
    }

    @Override
    public void run() {
        add();
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();

        T2 t2 = new T2();

        for (int i = 0; i < 10; i++) {
            service.submit(t2);
        }

        System.out.println(t2.getSize());

        service.shutdown();

    }
}
