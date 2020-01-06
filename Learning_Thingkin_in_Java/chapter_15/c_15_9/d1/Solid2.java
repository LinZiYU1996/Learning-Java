package chapter_15.c_15_9.d1;

import chapter_15.c_15_9.d.Dimension;
import chapter_15.c_15_9.d.HasColor;
import chapter_15.c_15_9.d.Weight;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:49 2020/1/6
 */
public class Solid2<T extends Dimension & HasColor & Weight>
        extends ColoredDimension2<T> {

    Solid2(T item) { super(item); }
    int weight() { return item.weight(); }
}
