package design_pattern.Factory_pattern.p5.a3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:59
 * \* Description:
 * \
 */
public class Factory implements IFactory{


    @Override
    public IProduct1 createProduct1() {
        return new Product1();
    }

    @Override
    public IProduct2 createProduct2() {
        return new Product2();
    }
}
