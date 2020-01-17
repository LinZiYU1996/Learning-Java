package thread.c2.c_2_2.c_2_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 17:26
 * \* Description:
 * \
 */
public class T4 {

    private static class A extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String s = new String();
                Math.random();
            }
        }
    }


    private static class B extends Thread{
        @Override
        public void run() {
            A a = new A();
            a.start();
            try {
                a.join();
                System.out.println("线程B over");
            } catch (InterruptedException e) {
                System.out.println("线程B catch");
                e.printStackTrace();
            }
        }
    }

    private static class C extends Thread{

        private B b;
        public C(B b){
            super();
            this.b = b;
        }

        @Override
        public void run() {
            b.interrupt();
        }
    }

    public static void main(String[] args) {

        try {
            B b = new B();
            b.start();
            Thread.sleep(5000);
            C c = new C(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
