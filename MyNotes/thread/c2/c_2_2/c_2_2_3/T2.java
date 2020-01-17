package thread.c2.c_2_2.c_2_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 19:58
 * \* Description:
 * \
 */
public class T2 {

    private static class T_b extends Thread{

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 50; i++) {
                if (this.isInterrupted()){
                    System.out.println("停止状态");
                    break;
                }
                System.out.println("i=   " + (i+1));
            }
        }
    }

    public static void main(String[] args) {

        try {
            T_b b = new T_b();
            b.start();
            Thread.sleep(3000);
            b.interrupt();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(" end ---");
    }
}
