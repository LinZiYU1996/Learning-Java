package thread.c2.c_2_2.c_2_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 19:52
 * \* Description:
 * \
 */
public class T1 {

    private static class T_a extends Thread{
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 30; i++) {
                System.out.println("i=  " + (i+1));
            }
        }
    }


    public static void main(String[] args) {

        try {
            T_a a = new T_a();
            a.start();
            Thread.sleep(3000);
            a.interrupt();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
