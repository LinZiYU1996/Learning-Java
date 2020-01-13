package chapter_21.c_21_2.c_21_2_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:43
 * \* Description:
 * \
 */
public class ExceptionThread implements Runnable{

//    下面的任务总是会抛出异常  并且传播到run方法外部
    public void run() {
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
