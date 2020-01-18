package thread.c3.c_3_1.c_3_1_2.a3;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 9:47
 * \* Description:
 * \
 */
public class MyStack {

    private List list = new ArrayList();

    synchronized public void push(){
        try {

            if (list.size() == 1){
                this.wait();
            }

            list.add("any = " + Math.random());
            this.notify();
            System.out.println("push  " + list.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String val = "";
        try {
            if (list.size() == 0){
                System.out.println("pop "+Thread.currentThread().getName());
                this.wait();
            }
            val = "" + list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop " + list.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        return val;
    }

}
