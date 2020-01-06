package chapter_15.c_15_10.c_15_10_2;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Jonathan;

import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:24 2020/1/6
 */
public class SuperTypeWildcards {

    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
// apples.add(new Fruit()); // Error
    }


}
