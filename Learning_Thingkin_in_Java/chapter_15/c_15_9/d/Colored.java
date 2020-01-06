package chapter_15.c_15_9.d;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:45 2020/1/6
 */
public class Colored<T extends HasColor> {

    T item;
    Colored(T item) { this.item = item; }
    T getItem() { return item; }
    // The bound allows you to call a method:
    java.awt.Color color() { return item.getColor(); }


}
