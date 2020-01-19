package thread.c3.c_3_1.c_3_1_6.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 17:01
 * \* Description:
 * \
 */
public class Singleton {

//    实例变量
    private byte[] data = new byte[1024];

//    定义实例对象的时候直接初始化
    private static Singleton instance = new Singleton();

//    私有构造函数
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
