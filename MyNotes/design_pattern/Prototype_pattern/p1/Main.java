package design_pattern.Prototype_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 21:56
 * \* Description:
 * \
 */
public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();

        UnderlinePen upen = new UnderlinePen('~');

        MessageBox mbox = new MessageBox('*');

        MessageBox sbox = new MessageBox('/');

        manager.register("strong",upen);

        manager.register("waring",mbox);

        manager.register("slash",sbox);

        Product p1 = manager.create("strong");

        p1.use("hello");

        Product p2 = manager.create("warning");

        p2.use("hello");

        Product p3 = manager.create("slash");

        p3.use("hello");

    }
}
