package thread.c3.c_3_1.c_3_1_3.a5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:46
 * \* Description:
 * \
 */
public class T1 {

    private static class Add1 implements Runnable{

        private static int coutn = 0;

        private static void add(){
            coutn++;
        }

        @Override
        public void run() {
            add();
        }
    }


    public static void main(String[] args) {

        Thread t1 = new Thread(new Add1());

        Thread t2 = new Thread(new Add1());

        for (int i = 0; i < 10; i++) {
            t1.start();
            t2.start();
        }

        System.out.println(Add1.coutn);

    }
}
