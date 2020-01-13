package chapter_21.c_21_2.c_21_2_4;

import java.util.concurrent.Callable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 22:15
 * \* Description:
 * \
 */
public class TaskWithResult implements Callable<String> {

//    从任务中产生返回值

//    Callable是一种具有类型参数的泛型  它的类型参数表示的是从方法call()中返回的值

//    并且必须使用  ExecutorService.submit方法调用它



    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }



    @Override
    public String call() throws Exception {
        return "result is   " + id;
    }
}
