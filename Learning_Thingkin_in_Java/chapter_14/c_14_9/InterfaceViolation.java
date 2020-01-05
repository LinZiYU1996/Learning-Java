package chapter_14.c_14_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 18:49 2020/1/5
 */
public class InterfaceViolation {

    public static void main(String[] args) {
        A a = new B();
        a.f();
// a.g(); // Compile error
        System.out.println(a.getClass().getName());
        if(a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }


}
