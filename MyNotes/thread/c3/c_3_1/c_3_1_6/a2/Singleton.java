package thread.c3.c_3_1.c_3_1_6.a2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 17:07
 * \* Description:
 * \
 */
public final class Singleton {

    private byte[] data = new byte[1024];

//    定义实例，但是不直接初始化
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
