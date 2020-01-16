package thread.c1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 20:34
 * \* Description:
 * \
 */
public class ThreadTest {


//    MyThread继承了Thread类，重写run方法
    public static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("Thread run");
        }
    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();


//        当创建完MyThread实例后线程并没有启动，除非你调用start方法
        myThread.start();

    }
}
