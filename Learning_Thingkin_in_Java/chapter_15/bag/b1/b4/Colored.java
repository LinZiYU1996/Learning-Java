package chapter_15.bag.b1.b4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:21
 * \* Description:
 * \
 */
public class Colored<T extends HasColor> {

    T item;

    public Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color(){
        return item.getColor();
    }

}
