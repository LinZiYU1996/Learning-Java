package C_1.c_1_8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 18:29
 * \* Description:
 * \
 */

//Raw use of parameterized class 'Apple'
public class A2 extends Apple{

    // 重写父类的方法
    public String getInfo()
    {
        // super.getInfo()方法返回值是Object类型，
        // 所以加toString()才返回String类型
        return super.getInfo().toString();
    }

}
