package design_pattern.Prototype_pattern.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 22:13
 * \* Description:
 * \
 */
public class TestMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype prototype1 = new ConcretePrototype1();
        ConcretePrototype1 concretePrototype1 = (ConcretePrototype1) prototype1.clone();
        System.out.println(concretePrototype1.f);
        Prototype prototype2 = new ConcretePrototype2();
        ConcretePrototype2 concretePrototype2 = (ConcretePrototype2) prototype2.clone();
        System.out.println(concretePrototype2.f);

    }
}
