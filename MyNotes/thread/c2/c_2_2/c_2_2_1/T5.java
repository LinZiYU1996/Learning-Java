package thread.c2.c_2_2.c_2_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 17:36
 * \* Description:
 * \
 */
public class T5 {

    private static class TA extends Thread{

        private TB tb;

        public TA(TB tb){
            super();
            this.tb = tb;
        }

        @Override
        public void run() {

            try {
                synchronized (tb){
                    System.out.println("A 开始了");
                    Thread.sleep(5000);
                    System.out.println("A 结束了");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



    private static class TB extends Thread{


        @Override
        synchronized public void run() {
            try {
                System.out.println("B开始了");
                Thread.sleep(5000);
                System.out.println("B结束了");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {

        try {

            TB tb = new TB();
            TA ta = new TA(tb);
            ta.start();
            tb.start();
            tb.join(2000);
            System.out.println("mian end");


        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
