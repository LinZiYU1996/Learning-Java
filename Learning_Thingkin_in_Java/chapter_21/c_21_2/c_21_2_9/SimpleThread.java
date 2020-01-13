package chapter_21.c_21_2.c_21_2_9;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:01
 * \* Description:
 * \
 */
public class SimpleThread extends Thread{


//    除了实现Runnable接口外
//    还可以继承Thread类
    private int count = 5;

    private static int threadC = 0;

    public SimpleThread(){

        super(Integer.toString(++threadC));
        start();
    }

    @Override
    public String toString() {
        return "SimpleThread{" +
                "count=" + count +
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
            new SimpleThread();
        }

    }
}
