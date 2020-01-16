package C_2.c_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 12:08
 * \* Description:
 * \
 */


class MyTest
{
    static
    {
        System.out.println("静态初始化块...");
    }
    // 使用一个字符串直接量为static final的类变量赋值
    static final String compileConstant = "Java";
}
public class CompileConstantTest
{
    public static void main(String[] args)
    {
        // 访问、输出MyTest中的compileConstant类变量
        System.out.println(MyTest.compileConstant);   // ①
    }
}