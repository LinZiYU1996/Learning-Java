package chapter_17.c_17_2.c_17_2_1;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:32 2020/1/6
 */
public class Government implements Generator<String> {

    String[] foundation = ("strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "government").split(" ");
    private int index;
    public String next() { return foundation[index++]; }
}

