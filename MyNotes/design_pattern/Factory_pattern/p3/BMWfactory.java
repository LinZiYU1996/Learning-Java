package design_pattern.Factory_pattern.p3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:39
 * \* Description:
 * \
 */
public class BMWfactory implements CarFactory{

    @Override
    public Car getCarByFactory() {
        return new BMW();
    }
}
