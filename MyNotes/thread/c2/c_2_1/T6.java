package thread.c2.c_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 10:30
 * \* Description:
 * \
 */
public class T6 {

    public static void main(String[] args) {
        try {
            MyThread3 t = new MyThread3();
            t.start();
            Thread.sleep(2000);
            t.interrupt(); // 中断线程t
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end main");
    }

}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 500000; i++) {
            if (Thread.interrupted()) {
                System.out.println("stop and exit...");
                break;
            }
            System.out.println("i: " + i);
        }
        // 尽管线程被中断，但并没有结束运行，这行代码还是被执行。

//        当t获取CPU执行时，if判断中，检测到中断状态，即在main线程中调用的t.interrupt()，for循环执行break跳出for循环，但是线程并没有结束，还是继续执行for后面的语句。可以将break改成return，则线程立刻结束执行。
//

        System.out.println("end run...");
    }


}

////当然也可以抛出InterruptedException异常：
class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i < 500000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("stop and exit...");
                    throw new InterruptedException();
                }
                System.out.println("i: " + i);
            }
            System.out.println("end run...");
        } catch (Exception e) {
//            当检测到中断标识为true，抛出异常，这样该线程就不会再执行其他的正常语句。
            System.out.println("catch interrupted...");
        }

    }
}

//前面说过不能生吞中断，修改如下：

class MyThread3 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i < 500000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("stop and exit...");
                    throw new InterruptedException();
                }
                System.out.println("i: " + i);
            }
            System.out.println("end run...");
        } catch (Exception e) {
            System.out.println("catch interrupted...");
            Thread.currentThread().interrupt(); // 不生吞中断
        }

    }
}
