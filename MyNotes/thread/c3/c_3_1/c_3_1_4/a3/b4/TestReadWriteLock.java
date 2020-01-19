package thread.c3.c_3_1.c_3_1_4.a3.b4;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 11:06
 * \* Description:
 * \
 */
public class TestReadWriteLock {

    public static void main(String[] args) {

        final Queue q3 = new Queue();
        for (int i = 0; i < 4; ++i) {
            new Thread() {
                public void run() {
                    while (true) {
                        q3.get();
                    }
                }
            }.start();
        }
        for (int i = 0; i < 4; ++i) {
            new Thread(""+i) {
                public void run() {
                    while (true) {
                        q3.put(new Random().nextInt(10000));
                    }
                }
            }.start();

            System.out.println("");
        }


    }
}
