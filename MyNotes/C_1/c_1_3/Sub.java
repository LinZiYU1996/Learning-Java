package C_1.c_1_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 15:35
 * \* Description:
 * \
 */


class Base
{
    public double size;
    public String name;
    public Base(double size , String name)
    {
        this.size = size;
        this.name = name;
    }
}
public class Sub extends Base
{
    public String color;
    public Sub(double size , String name , String color)
    {
        // 通过super调用来调用父类构造器的初始化过程
        super(size , name);
        this.color = color;
    }
    public static void main(String[] args)
    {
        Sub s = new Sub(5.6 , "World" , "红色");
        // 输出Sub对象的三个实例变量
        System.out.println(s.size + "--" + s.name
                + "--" + s.color);
    }
}
