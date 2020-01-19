package thread.c3.c_3_1.c_3_1_6.a3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 17:11
 * \* Description:
 * \
 */
public class Singleton {

    private byte[] data = new byte[1024];

    private static Singleton instance = null;

    private Singleton() {
    }

//    加入同步控制，每次只有一个线程能够进入
    public synchronized static Singleton getInstance() {
        if (null==instance){
            instance = new Singleton();
        }
        return instance;
    }
}
