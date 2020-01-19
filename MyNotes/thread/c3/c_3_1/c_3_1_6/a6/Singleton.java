package thread.c3.c_3_1.c_3_1_6.a6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/19
 * \* Time: 17:30
 * \* Description:
 * \
 */
public class Singleton {

    private byte[] data = new byte[1024];

    private Singleton() {
    }

//    在静态内部类中持有Singleton实例，并且直接进行初始化
    private static class Holder{
        private static Singleton instance = new Singleton();
    }


    public static Singleton getInstance(){
        return Holder.instance;
    }
}
