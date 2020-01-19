package thread.c3.c_3_1.c_3_1_4.a2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 21:48
 * \* Description:
 * \
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService myService = new MyService();

        ThreadA a = new ThreadA(myService);

        a.start();

        Thread.sleep(5000);

        myService.signal();

    }


//    Object类中的wait()方法相当于Condition类中的await()方法。
//Object类中的wait(long timeout)方法相当于Condition类中的await(long time,TimeUnit unit)方法。
//Object类中的notify()方法相当于Condition类中的signal()方法。
//Object类中的notifyAll()方法相当于Condition类中的signalAll()方法。

}
