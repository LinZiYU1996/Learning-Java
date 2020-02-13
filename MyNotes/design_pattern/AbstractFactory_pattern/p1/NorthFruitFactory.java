package design_pattern.AbstractFactory_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/13
 * \* Time: 21:26
 * \* Description:
 * \
 */
public class NorthFruitFactory implements FruitFactory{

    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
