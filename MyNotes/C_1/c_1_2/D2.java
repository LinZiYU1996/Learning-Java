package C_1.c_1_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/14
 * \* Time: 9:52
 * \* Description:
 * \
 */

class A{

    public A() {
        System.out.println("the a is ___");
    }

    public A(String name){
        this();

        System.out.println(name);

    }
}
public class D2 {

    public static void main(String[] args) {
        A a = new A("jsaksjk");

    }
}
