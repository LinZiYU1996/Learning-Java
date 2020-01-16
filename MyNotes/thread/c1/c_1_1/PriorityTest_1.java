package thread.c1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 22:03
 * \* Description:
 * \
 */
public class PriorityTest_1 {


    static class T1 extends Thread{

        @Override
        public void run() {
            System.out.println(this.getPriority());

        }
    }

    public static void main(String[] args) {

        T1 t1 = new T1();
        t1.start();

    }
}
