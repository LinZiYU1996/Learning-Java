package thread.c2.c_2_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 13:31
 * \* Description:
 * \
 */
public class T3 {

    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println("one over");
            }
        });


        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("two over");
            }
        });

//      启动两个子线程
        one.start();

        two.start();


        System.out.println("wati all thread over");


//        分别调用子线程的join方法
//        那么主线程就会在调用one.join()方法后被阻塞
//        等待one执行完毕后返回
//        one执行完毕后同理two又开始join了
        one.join();

        two.join();

        System.out.println("all thread over");
    }
}
