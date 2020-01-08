package chapter_15.bag.b1.b4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:23
 * \* Description:
 * \
 */
public class ColoredDimension<T extends Dimension & HasColor> {

    T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color(){
        return item.getColor();
    }

    int getX(){
        return item.x;
    }
}
