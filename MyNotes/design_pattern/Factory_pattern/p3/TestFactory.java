package design_pattern.Factory_pattern.p3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:40
 * \* Description:
 * \
 */
public class TestFactory {

    public static void main(String[] args) {

        Car bmw= new BMWfactory().getCarByFactory();
        bmw.getCar();

    }
}
