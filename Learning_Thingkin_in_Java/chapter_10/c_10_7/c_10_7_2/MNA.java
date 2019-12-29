package chapter_10.c_10_7.c_10_7_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:52 2019/12/29
 */
class MNA {

    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                g();
                f();
            }
        }
    }


}
