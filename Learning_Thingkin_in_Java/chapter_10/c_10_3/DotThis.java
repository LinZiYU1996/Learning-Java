package chapter_10.c_10_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:40 2019/12/29
 */
public class DotThis {

    void f() { System.out.println("DotThis.f()"); }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
// A plain "this" would be Inner’s "this"
        }
    }
    public Inner inner() { return new Inner(); }
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }


}
