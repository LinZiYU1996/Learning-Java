package thread.c3.c_3_1.c_3_1_2.a2;

import thread.c3.c_3_1.c_3_1_2.a1.ValueObject;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:50
 * \* Description:
 * \
 */
public class C {

    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getVal() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者" +
                            Thread.currentThread().getName() + "waiting *");
                    lock.wait();
                }
                System.out.println("消费者"+Thread.currentThread().getName());
//                String value = System.currentTimeMillis() + "_" + System.nanoTime();
//                System.out.println("set  " + value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
