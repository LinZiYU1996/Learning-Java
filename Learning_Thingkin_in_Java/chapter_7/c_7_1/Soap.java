package chapter_7.c_7_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:07 2019/12/26
 */
public class Soap {

    private String s;
    Soap() {
        print("Soap() Constructed");
        s = "Constructed";
    }
    public String toString() { return s; }

}
