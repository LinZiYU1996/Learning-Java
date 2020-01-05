package chapter_14.c_14_7.d;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:00 2020/1/5
 */
public class Implementation implements SomeMethods{

    public void boring1() { print("boring1"); }
    public void boring2() { print("boring2"); }
    public void interesting(String arg) {
        print("interesting " + arg);
    }
    public void boring3() { print("boring3"); }


}
