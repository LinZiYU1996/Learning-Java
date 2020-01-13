package C_1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 22:20
 * \* Description:
 * \
 */

class AA{

    public AA(String s) {

        System.out.println(s);
    }
}

class BB{
    AA a1 = new AA("a1");

    static AA a2 = new AA("a2");

    static AA a3,a4;

    static {

        System.out.println("______________");

        a3 = new AA("a3");

        a4 = new AA("a4");

        AA a5 = new AA("a5");

        System.out.println("++++++++++++");

    }

    static AA a6 = new AA("a6");

    AA a7 = new AA("a7");

    public BB() {

        System.out.println("BB");
    }
}
public class Initialization_3 {

    static BB b1 = new BB();

    public static void main(String[] args) {

        new BB();

    }


}
