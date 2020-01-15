package C_1.c_1_8.c_1_8_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 20:07
 * \* Description:
 * \
 */
// 定义Shape的子类Rectangle
public class Rectangle extends Shape
{
    // 实现画图方法，以打印字符串来模拟画图方法实现
    public void draw(Canvas c)
    {
        System.out.println("把一个矩形画在画布" + c + "上");
    }
}
