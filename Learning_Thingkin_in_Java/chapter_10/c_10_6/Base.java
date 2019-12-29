package chapter_10.c_10_6;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:08 2019/12/29
 */
abstract class Base {

    public Base(int i) {
        print("Base constructor, i = " + i);
    }
    public abstract void f();

}
