package design_pattern.Prototype_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 22:12
 * \* Description:
 * \
 */
public class ConcretePrototype1 extends Prototype{

    public static int f = 1;

    //克隆自身方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }
}
