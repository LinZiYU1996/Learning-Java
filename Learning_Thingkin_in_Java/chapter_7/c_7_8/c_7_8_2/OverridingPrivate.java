package chapter_7.c_7_8.c_7_8_2;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:32 2019/12/26
 */
public class OverridingPrivate extends WithFinals{

    private final void f()
    {
        print("OverridingPrivate.f()");
    }

    private void g()
    {
        print("OverridingPrivate.g()");
    }


}
