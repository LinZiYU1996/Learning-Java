package chapter_7.c_7_8.c_7_8_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:33 2019/12/26
 */
public class FinalOverridingIllusion {

    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
// You can upcast:
        OverridingPrivate op = op2;
// But you can’t call the methods:
//! op.f();
//! op.g();
// Same here:
        WithFinals wf = op2;
//! wf.f();
//! wf.g();
    }



}
