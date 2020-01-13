package chapter_21.c_21_2.c_21_2_14;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:45
 * \* Description:
 * \
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

//    Thread.UncaughtExceptionHandler是Java5的新接口
//    它可以在每个thread对象上附着一个异常处理器

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName();
    }
}
