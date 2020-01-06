package chapter_15.c_15_9.d1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:48 2020/1/6
 */
public class HoldItem<T> {

    T item;
    HoldItem(T item) { this.item = item; }
    T getItem() { return item; }
}
