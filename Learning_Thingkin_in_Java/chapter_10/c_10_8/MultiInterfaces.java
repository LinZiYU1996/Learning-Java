package chapter_10.c_10_8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:54 2019/12/29
 */
public class MultiInterfaces {

    static void takesA(A a) {}
    static void takesB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }


}
