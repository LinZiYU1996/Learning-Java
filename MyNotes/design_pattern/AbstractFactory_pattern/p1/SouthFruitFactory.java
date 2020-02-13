package design_pattern.AbstractFactory_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/13
 * \* Time: 21:27
 * \* Description:
 * \
 */
public class SouthFruitFactory implements FruitFactory{

    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }


}
