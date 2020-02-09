package design_pattern.Factory_pattern.p4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:43
 * \* Description:
 * \
 */
public class FactoryTwo implements Factory{

    @Override
    public Car getCarByFactory() {
        return new BYD();
    }

    @Override
    public Plane getPlaneByFactory() {
        return new BattlePlane ();
    }
}
