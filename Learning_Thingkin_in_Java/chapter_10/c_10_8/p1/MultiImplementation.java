package chapter_10.c_10_8.p1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:56 2019/12/29
 */
public class MultiImplementation {

    static void takesD(D d) {}
    static void takesE(E e) {}
    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
