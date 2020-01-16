package C_2.c_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 12:10
 * \* Description:
 * \
 */


class Tester
{
    static
    {
        System.out.println("Tester类的静态初始化块...");
    }
}
public class ClassLoaderTest
{
    public static void main(String[] args)
            throws ClassNotFoundException
    {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        // 下面语句仅仅是加载Tester类
        cl.loadClass("C_2.c_2_3.Tester");
        System.out.println("系统加载Tester类");
        // 下面语句才会初始化Tester类
        Class.forName("Tester");
    }
}

