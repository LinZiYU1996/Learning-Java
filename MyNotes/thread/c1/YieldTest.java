package thread.c1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 21:38
 * \* Description:
 * \
 */
public class YieldTest implements Runnable{


    public YieldTest() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if ( (i % 5) == 0){
                System.out.println(Thread.currentThread().getName()+"yirld");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"over");
    }

    public static void main(String[] args) {
        new YieldTest();

        new YieldTest();
    }

}
