package chapter_15.bag.b1.b4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:25
 * \* Description:
 * \
 */
public class Solid<T extends Dimension & HasColor & Weight> {

    T item;

    public Solid(T item) {
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

    int weight(){
        return item.weight();
    }
}
