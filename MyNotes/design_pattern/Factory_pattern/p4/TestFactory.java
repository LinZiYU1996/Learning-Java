package design_pattern.Factory_pattern.p4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:43
 * \* Description:
 * \
 */
public class TestFactory {

    public static void main(String[] args) {

        Car byd = new FactoryTwo().getCarByFactory();
        byd.getCar();
        Plane airPlane = new FactoryOne().getPlaneByFactory();
        airPlane.getPlane();

    }
}
