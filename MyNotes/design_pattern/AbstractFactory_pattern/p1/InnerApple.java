package design_pattern.AbstractFactory_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/13
 * \* Time: 21:24
 * \* Description:
 * \
 */
public class InnerApple extends Apple{

    @Override
    public void get() {
        System.out.println("长在室内的苹果");
    }
}
