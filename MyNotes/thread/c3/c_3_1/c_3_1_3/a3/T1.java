package thread.c3.c_3_1.c_3_1_3.a3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/18
 * \* Time: 11:35
 * \* Description:
 * \
 */
public class T1 {

    public static void main(String[] args) {
        Syncthread syncthread = new Syncthread();
        Thread thread1 = new Thread(syncthread, "a");
        Thread thread2 = new Thread(syncthread, "b");
        thread1.start();
        thread2.start();
    }
}
