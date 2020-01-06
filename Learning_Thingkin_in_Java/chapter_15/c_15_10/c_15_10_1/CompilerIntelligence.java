package chapter_15.c_15_10.c_15_10_1;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Fruit;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:23 2020/1/6
 */
public class CompilerIntelligence {

    public static void main(String[] args) {
        List<? extends Fruit> flist =
                Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0); // No warning
        flist.contains(new Apple()); // Argument is ‘Object’
        flist.indexOf(new Apple()); // Argument is ‘Object’
    }


}
