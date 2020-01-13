package chapter_21.c_21_2.c_21_2_14;

import java.util.concurrent.ThreadFactory;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:45
 * \* Description:
 * \
 */
public class HandlerThreadFactory implements ThreadFactory {


//    ThreadFactory为每个新创建的thread对象添加一个Thread.UncaughtExceptionHandler


    public Thread newThread(Runnable r) {
        System.out.println(this + " creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(
                new MyUncaughtExceptionHandler());
        System.out.println(
                "eh = " + t.getUncaughtExceptionHandler());
        return t;
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName();
    }
}
