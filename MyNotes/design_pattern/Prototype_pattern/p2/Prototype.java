package design_pattern.Prototype_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 22:12
 * \* Description:
 * \
 */
public abstract class Prototype implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
