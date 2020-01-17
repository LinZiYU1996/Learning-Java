package thread.c2.c_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 10:13
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

//        检测当前线程是否被中断，并且中断状态会被清除（即重置为false）；由于它是静态方法，因此不能在特定的线程上使用，只能报告调用它的线程的中断状态；如果该方法被调用两次，则第二次一般是返回false，如果线程不存活，则返回false。



        System.out.println("1: " + Thread.interrupted());
        Thread.currentThread().interrupt();
        System.out.println("2: " + Thread.interrupted());
        System.out.println("3: " + Thread.interrupted());
    }
}
