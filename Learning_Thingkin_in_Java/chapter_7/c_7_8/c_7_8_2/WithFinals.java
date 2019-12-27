package chapter_7.c_7_8.c_7_8_2;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:32 2019/12/26
 */
public class WithFinals {

    // Identical to "private" alone:

    private final void f() { print("WithFinals.f()"); }

    // Also automatically "final":

    private void g() { print("WithFinals.g()"); }


}
