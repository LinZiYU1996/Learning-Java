package C_2.c_2_5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/16
 * \* Time: 17:38
 * \* Description:
 * \
 */

class A{


}

public class T1 {

    public static void swap(A a){

        System.out.println(a);
    }

    public static void main(String[] args) {

        A a = new A();

        A temp = a;

        a = new A();

        swap(temp);

        System.out.println(a);

    }
}
