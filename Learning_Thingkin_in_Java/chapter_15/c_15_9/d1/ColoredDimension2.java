package chapter_15.c_15_9.d1;

import chapter_15.c_15_9.d.Dimension;
import chapter_15.c_15_9.d.HasColor;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:49 2020/1/6
 */
public class ColoredDimension2<T extends Dimension & HasColor>
        extends Colored2<T> {

    ColoredDimension2(T item) { super(item); }
    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }

}
