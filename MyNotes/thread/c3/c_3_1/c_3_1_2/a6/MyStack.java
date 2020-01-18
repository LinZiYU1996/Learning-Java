package thread.c3.c_3_1.c_3_1_2.a6;

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

//            当一个生产者 多个消费者操作栈  会出现假死现象
//            应该push中使用了if判断
//            将 if 改成 while
//            以及notify 改成 notifyAll

            while (list.size() == 1){
                this.wait();
            }

            list.add("any = " + Math.random());
            this.notifyAll();
            System.out.println("push  " + list.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String val = "";
        try {
            while (list.size() == 0){
                System.out.println("pop "+Thread.currentThread().getName());
                this.wait();
            }
            val = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop " + list.size());
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        return val;
    }

}
