package design_pattern.Adapter_pattern.p4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:28
 * \* Description:
 * \
 */

//基于对象的适配器，组合适配者对象,采用对象聚合的方式进行适配
public class ObjectAdapterMode implements Targetable{

    private Adaptee adaptee;

    public ObjectAdapterMode(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int V5() {
        return adaptee.v220()/44;
    }
}
