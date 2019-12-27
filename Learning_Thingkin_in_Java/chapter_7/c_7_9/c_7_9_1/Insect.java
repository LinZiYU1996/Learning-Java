package chapter_7.c_7_9.c_7_9_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:37 2019/12/26
 */
public class Insect {

    private int i = 9;

    protected int j;

    Insect()
    {
        print("i = " + i + ", j = " + j);
        j = 39;
    }


    private static int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s)
    {
        print(s);
        return 47;
    }
}
