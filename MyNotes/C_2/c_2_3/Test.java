package C_2.c_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 12:04
 * \* Description:
 * \
 */
public class Test {

    static
    {
        // 使用静态初始化块为变量b指定出初始值
        b = 6;
        System.out.println("----------");
    }
    // 声明变量a时指定初始值
    static int a = 5;
    static int b = 9;         // ①
    static int c;
    public static void main(String[] args)
    {
        System.out.println(Test.b);
    }
}
