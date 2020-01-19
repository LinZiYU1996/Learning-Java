package thread.c3.c_3_1.c_3_1_5.a3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 16:26
 * \* Description:
 * \
 */
public class AtomicRefTest {

    public static void main(String[] args) throws InterruptedException {
        AtomicReference<Integer> ref = new AtomicReference<>(new Integer(1000));

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(new Task(ref), "Thread-" + i);
            list.add(t);
            t.start();
        }

        for (Thread t : list) {
            t.join();
        }

        System.out.println(ref.get());    // 打印2000
    }

}

//该示例并没有使用锁，而是使用自旋+CAS的无锁操作保证共享变量的线程安全。1000个线程，每个线程对金额增加1，最终结果为2000，如果线程不安全，最终结果应该会小于2000
class Task implements Runnable {
    private AtomicReference<Integer> ref;

    Task(AtomicReference<Integer> ref) {
        this.ref = ref;
    }

    @Override
    public void run() {
        for (; ; ) {    //自旋操作
            Integer oldV = ref.get();
            if (ref.compareAndSet(oldV, oldV + 1))  // CAS操作
                break;
        }
    }
}



