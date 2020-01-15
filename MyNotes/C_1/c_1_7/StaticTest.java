package C_1.c_1_7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 10:05
 * \* Description:
 * \
 */
public class StaticTest {

    // 定义一个非静态的内部类，是一个空类
    private class In{}
    // 外部类的静态方法
    public static void main(String[] args)
    {
        // 下面代码引发编译异常，因为静态成员（main()方法）
        // 无法访问非静态成员（In类）
//        new In();
    }
}
