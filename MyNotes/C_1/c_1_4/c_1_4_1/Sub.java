package C_1.c_1_4.c_1_4_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 19:43
 * \* Description:
 * \
 */
class Base
{
    public Base()
    {
        test();
    }
    public void test()           // ①号test()方法
    {
        System.out.println("将被子类重写的方法");
    }
}
public class Sub extends Base
{
    private String name;
    public void test()         // ②号test()方法
    {
        System.out.println("子类重写父类的方法，"
                + "其name字符串长度" + name.length());
    }
    public static void main(String[] args)
    {
        // 下面代码会引发空指针异常
        Sub s = new Sub();
    }
}