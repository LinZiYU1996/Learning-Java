package design_pattern.Factory_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:36
 * \* Description:
 * \
 */
public class testFactory {

    public static void main(String[] args) {
        Car car = CarFactor.carFactor(BYD.class);
        car.getCar();

    }
}
