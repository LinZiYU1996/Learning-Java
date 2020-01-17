package thread.c2.c_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 10:08
 * \* Description:
 * \
 */
public class T1 {


//    检测调用该方法的线程是否被中断，中断状态不会被清除。线程一旦被中断，该方法返回true，
//    而一旦sleep等方法抛出异常，它将清除中断状态，此时方法将返回false。


    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("1: " + t.isInterrupted());
        t.interrupt();
        System.out.println("2: " + t.isInterrupted());
        System.out.println("3: " + t.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("not interrted...");
        } catch (Exception e) {
            System.out.println("interrupted...");
            System.out.println("4: " + t.isInterrupted());
        }
        System.out.println("5: " + t.isInterrupted());
    }


}
