package C_1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 22:07
 * \* Description:
 * \
 */

class A_1{

    A_1(String s) {

         System.out.println(s);
    }

    void a_f(String s){
        System.out.println("a_f{{{{{{" + s);
    }

}

class B_1{

    A_1 a1 = new A_1("a1");
    static A_1 a2 = new A_1("a2");

    B_1() {
        System.out.println("B_1");
        a2.a_f("a2");
    }

    void b_f(){
        System.out.println("B_F");
    }
}

class C{

    static A_1 a3 = new A_1("a3");

    A_1 a4 = new A_1("a4");

    C() {
        System.out.println("c");

        a4.a_f("a4");
    }

    void c_f(){
        System.out.println("C_F---");
    }
}
public class Initialization_2 {

    public static void main(String[] args) {

        System.out.println("_____________________");

        new B_1();

        System.out.println("++++++++++++++++++++++");

        new C();



    }

    B_1 b1 = new B_1();

    static B_1 b2 = new B_1();

    static B_1 b3 = new B_1();

    C c1 = new C();

    static C c2 = new C();

    static C c3 = new C();


}
