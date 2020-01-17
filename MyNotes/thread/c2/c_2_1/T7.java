package thread.c2.c_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 10:34
 * \* Description:
 * \
 */
public class T7 extends Thread{

    volatile Boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        T7 t = new T7();
        System.out.println("starting thread...");
        t.start();

        Thread.sleep(10000);

        System.out.println("asking thread to stop...");
        // 必须要在interrupt之前设置
        // 如果线程阻塞，将不会检查此变量，调用interrupt之后，线程就可以尽早的终结被阻塞状态，能够检查这一变量
        t.stop = true;
        // 如果线程没有被阻塞，这时调用interrupt将不起作用。
        // 这一方法实际上完成的是：在线程受到阻塞时抛出一个中断信号，这样线程就可以退出阻塞状态
        t.interrupt();

        Thread.sleep(3000);
        System.out.println("stopping app...");
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("interrupted...");
            }
        }
        System.out.println("thread exit...");
    }

//    把握几个重点：stop变量、run方法中的sleep()、interrupt()、InterruptedException。串接起来就是这个意思：
//
//当我们在run方法中调用sleep（或其他阻塞线程的方法）时，如果线程阻塞的时间过长，比如10s，那在这10s内，线程阻塞，run方法不被执行；
//但是如果在这10s内，stop被设置成true，表明要终止这个线程；但是，现在线程是阻塞的，它的run方法不能执行，自然也就不能检查stop，所以线程不能终止；
//这个时候，我们就可以用interrupt()方法了：我们在thread.stop = true;语句后调用thread.interrupt()方法， 该方法将在线程阻塞时抛出一个中断信号，
// 该信号将被catch语句捕获到，一旦捕获到这个信号，线程就提前终结自己的阻塞状态；
//这样，它就能够 再次运行run 方法了，然后检查到stop = true，while循环就不会再被执行，在执行了while后面的清理工作之后，run方法执行完 毕，线程终止。
//当代码调用中需要抛出一个InterruptedException，可以选择吧中断状态复位，也可以选在向外抛出InterruptedException，由外层的调用者来决定。
}
