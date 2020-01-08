package chapter_15.bag.b1.b5;

import chapter_15.bag.b1.b4.HasColor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:30
 * \* Description:
 * \
 */
public class Color2<T extends HasColor> extends HoldItem<T> {

    public Color2(T item) {
        super(item);
    }

    java.awt.Color color(){
        return item.getColor();
    }


}
