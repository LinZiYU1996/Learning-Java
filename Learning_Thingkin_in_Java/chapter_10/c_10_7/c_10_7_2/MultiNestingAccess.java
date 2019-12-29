package chapter_10.c_10_7.c_10_7_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:52 2019/12/29
 */
public class MultiNestingAccess {

    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }


}
