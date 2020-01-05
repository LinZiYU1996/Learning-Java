package chapter_15.c_15_4.c_15_4_6;

import java.util.EnumSet;
import java.util.Set;

import static chapter_15.c_15_4.c_15_4_6.Sets.*;
import static chapter_15.c_15_4.c_15_4_6.Watercolors.*;
import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:14 2020/1/5
 */
public class WatercolorSets {

    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 =
                EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        print("set1: " + set1);
        print("set2: " + set2);
        print("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        print("intersection(set1, set2): " + subset);
        print("difference(set1, subset): " +
                difference(set1, subset));
        print("difference(set2, subset): " +
                difference(set2, subset));
        print("complement(set1, set2): " +
                complement(set1, set2));
    }


}
