package design_pattern.AbstractFactory_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/13
 * \* Time: 21:25
 * \* Description:
 * \
 */
public class InnerBanana extends Banana{

    @Override
    public void get() {
        System.out.println("长在室内的香蕉");
    }
}
