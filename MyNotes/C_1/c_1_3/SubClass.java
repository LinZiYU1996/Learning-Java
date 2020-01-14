package C_1.c_1_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 15:12
 * \* Description:
 * \
 */


class BaseClass
{
    public int a = 5;
}
public class SubClass extends BaseClass
{
    public int a = 7;
    public void accessOwner()
    {
        System.out.println(a);
    }
    public void accessBase()
    {
        // 通过super来限定访问从父类继承得到的a实例变量
        System.out.println(super.a);
    }
    public static void main(String[] args)
    {
        SubClass sc = new SubClass();
        sc.accessOwner(); // 输出7
        sc.accessBase(); // 输出5
    }
}

