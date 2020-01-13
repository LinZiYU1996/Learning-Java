package C_1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 22:00
 * \* Description:
 * \
 */


class A{

    A(String s) {

        System.out.println(s);

    }
}

class B{

    A a1 = new A("a1");

    B() {

        System.out.println("B");
        A a2 = new A("a2");

    }

    A a3 = new A("a3");
    void f(){
        System.out.println("f---");
    }
    A a4 = new A("a4");
}

public class Initialization_1 {

    public static void main(String[] args) {

        B b = new B();

        b.f();

    }

}
