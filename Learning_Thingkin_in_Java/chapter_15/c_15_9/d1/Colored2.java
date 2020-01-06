package chapter_15.c_15_9.d1;

import chapter_15.c_15_9.d.HasColor;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:49 2020/1/6
 */
public class Colored2<T extends HasColor> extends HoldItem<T> {

    Colored2(T item) { super(item); }
    java.awt.Color color() { return item.getColor(); }
}
