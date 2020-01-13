package chapter_21.c_21_2.c_21_2_9;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:19
 * \* Description:
 * \
 */
public class ThreadVariations {

    public static void main(String[] args) {

        new InnerThread_1("InnerThread1");
        new InnerThread2("InnerThread2");
        new InnerRunnable1("InnerRunnable1");
        new InnerRunnable2("InnerRunnable2");
        new ThreadMethod("ThreadMethod").runTask();


    }
}
