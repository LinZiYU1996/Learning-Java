package C_1.c_1_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 15:30
 * \* Description:
 * \
 */


class Parent
{
    public String tag = "parent";         //①
}
class Derived extends Parent
{
    // 定义一个私有的tag实例变量来隐藏父类的tag实例变量
    private String tag = "Derived";         //②
}
public class HideTest
{
    public static void main(String[] args)
    {
        Derived d = new Derived();
        // 程序不可访问d的私有变量tag，所以下面语句将引起编译错误
        // System.out.println(d.tag);         //③
        // 将d变量显式地向上转型为Parent后，即可访问tag实例变量
        System.out.println(((Parent)d).tag);         //④
    }
}
