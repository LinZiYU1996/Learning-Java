package chapter_21.c_21_2.c_21_2_9;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:06
 * \* Description:
 * \
 */
public class SelfManaged implements Runnable{


//    自己管理的Runnable


    private int count = 5;

    private Thread thread = new Thread(this);

    public SelfManaged() {
        thread.start();
    }

    @Override
    public String toString() {
        return Thread.currentThread().getName() + "SelfManaged{" +
                "count=" + count +
                ", thread=" + thread +
                '}';
    }

    @Override
    public void run() {

        while (true) {

            System.out.println(this);

            if (--count == 0) {

                return;
            }

        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new SelfManaged();
        }

    }
}
