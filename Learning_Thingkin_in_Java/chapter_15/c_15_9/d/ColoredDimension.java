package chapter_15.c_15_9.d;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:46 2020/1/6
 */
public class ColoredDimension<T extends Dimension & HasColor>{

    T item;
    ColoredDimension(T item) { this.item = item; }
    T getItem() { return item; }
    java.awt.Color color() { return item.getColor(); }
    int getX() { return item.x; }
    int getY() { return item.y; }
    int getZ() { return item.z; }


}
