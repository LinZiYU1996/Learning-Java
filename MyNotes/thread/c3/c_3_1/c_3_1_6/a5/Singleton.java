package thread.c3.c_3_1.c_3_1_6.a5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 17:14
 * \* Description:
 * \
 */
public class Singleton {

    private byte[] data = new byte[1024];

    private volatile static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {

//        当instance为null，进入同步代码块，避免了每次都要进入
        if (null == instance){


//            只有一个线程能够获得Singleton.class关联的锁
            synchronized (Singleton.class){
                if (null == instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
