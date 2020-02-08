package design_pattern.Factory_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/7
 * \* Time: 22:23
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();

        Product product1 = factory.create("A");
        Product product2 = factory.create("B");
        Product product3 = factory.create("C");

        product1.use();
        product2.use();
        product3.use();
    }
}
