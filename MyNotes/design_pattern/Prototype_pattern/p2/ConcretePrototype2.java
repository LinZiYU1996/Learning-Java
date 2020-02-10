package design_pattern.Prototype_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 22:13
 * \* Description:
 * \
 */
public class ConcretePrototype2 extends Prototype{

    public static int f = 2;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (ConcretePrototype2) super.clone();
    }
}
