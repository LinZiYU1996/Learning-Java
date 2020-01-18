package thread.c3.c_3_1.c_3_1_3.a7;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:57
 * \* Description:
 * \
 */
public class T1 implements Runnable{

    private static int num = 0;

    private  Object object;

    public T1(Object object) {
        this.object = object;
    }

    public  void add(){
        synchronized (object){
            num++;
        }

    }

    @Override
    public void run() {
        add();
//        System.out.println(num);
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();

        Object o = new Object();


        for (int i = 0; i < 100; i++) {
            service.execute(new T1(o));
        }


        System.out.println(T1.num);
        service.shutdown();

    }
}
