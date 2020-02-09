package design_pattern.Factory_pattern.p5.a3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:59
 * \* Description:
 * \
 */
public class Client {

    public static void main(String[] args) {

        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();


    }
}
