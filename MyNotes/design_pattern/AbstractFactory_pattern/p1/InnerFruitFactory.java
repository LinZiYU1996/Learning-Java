package design_pattern.AbstractFactory_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/13
 * \* Time: 21:25
 * \* Description:
 * \
 */
public class InnerFruitFactory implements FruitFactory{


    @Override
    public Fruit getApple() {
        return new InnerApple();
    }

    @Override
    public Fruit getBanana() {
        return new InnerBanana();
    }
}
