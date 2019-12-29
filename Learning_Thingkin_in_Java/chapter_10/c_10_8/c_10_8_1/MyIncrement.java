package chapter_10.c_10_8.c_10_8_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:58 2019/12/29
 */
class MyIncrement {

    public void increment() { print("Other operation"); }
    static void f(MyIncrement mi) { mi.increment(); }


}
