package chapter_14.c_14_7;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:59 2020/1/4
 */
public class RealObject implements Interface{

    public void doSomething() { print(" RealObject doSomething"); }
    public void somethingElse(String arg) {
        print(" RealObject somethingElse " + arg);
    }


}
