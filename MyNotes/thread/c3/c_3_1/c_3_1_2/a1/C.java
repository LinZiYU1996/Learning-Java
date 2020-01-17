package thread.c3.c_3_1.c_3_1_2.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 22:34
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
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }

                System.out.println("get  " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
