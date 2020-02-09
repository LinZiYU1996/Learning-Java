package design_pattern.Factory_pattern.p4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:43
 * \* Description:
 * \
 */
public class FactoryOne implements Factory{

    @Override
    public Car getCarByFactory() {
        return new BMW();
    }

    @Override
    public Plane getPlaneByFactory() {
        return new AirPlane();
    }
}
