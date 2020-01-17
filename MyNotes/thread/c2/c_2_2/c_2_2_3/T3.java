package thread.c2.c_2_2.c_2_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 20:02
 * \* Description:
 * \
 */
public class T3 {

    private static class Tc extends Thread{

        @Override
        public void run() {
            super.run();
            try {
                for (int i = 0; i < 50; i++) {
                    if (this.isInterrupted()){
                        System.out.println("停止");
                        throw new InterruptedException();
                    }
                    System.out.println(i);
                }
                System.out.println("for下面");
            } catch (InterruptedException e){
                System.out.println("catch");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        try {
            Tc c = new Tc();
            c.start();
            Thread.sleep(1000);
            c.interrupt();
        } catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end --- ");

    }
}
