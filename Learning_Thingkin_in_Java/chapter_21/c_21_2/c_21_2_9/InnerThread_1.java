package chapter_21.c_21_2.c_21_2_9;



/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 10:13
 * \* Description:
 * \
 */
public class InnerThread_1 {


//    通过内部类 来隐藏线程代码
    private int count = 5;

    private Inner inner;

    private class Inner extends Thread {

        Inner(String name){

            super(name);

            start();

        }

        @Override
        public void run() {
            while (true) {

                System.out.println(this);

                if (--count == 0) {
                    return;
                }

                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        @Override
        public String toString() {
            return "Inner{}";
        }

    }

    public InnerThread_1(String name){

        inner = new Inner(name);
    }


}
