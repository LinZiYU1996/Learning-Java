package thread.c3.c_3_1.c_3_1_5.a1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 14:57
 * \* Description:
 * \
 */
public class T1 {


    public static void test(int newValue,int delta,int update,int expect){
        AtomicInteger i = new AtomicInteger(0);

        i.getAndSet(newValue);//获取当前值并设置新值

        i.getAndIncrement();//相当于 i ++
        i.incrementAndGet();//相当于 ++ i

        i.getAndDecrement();//相当于 i --
        i.decrementAndGet();//相当于 -- i

        i.addAndGet(delta);//相当于 i + delta，并返回添加后的值
        i.getAndAdd(delta);//相当于 i + delta，并返回添加前的值

        i.compareAndSet(expect,update);//CAS 操作，返回 boolean值，表示是否更新成功


    }

    public static void main(String[] args) {





    }
}
