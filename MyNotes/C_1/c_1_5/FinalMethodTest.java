package C_1.c_1_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 20:53
 * \* Description:
 * \
 */
public class FinalMethodTest
{
    public final void test(){}
}
class Sub extends FinalMethodTest
{
    // 下面方法定义将出现编译错误，不能重写final方法
//    public void test(){}
}
