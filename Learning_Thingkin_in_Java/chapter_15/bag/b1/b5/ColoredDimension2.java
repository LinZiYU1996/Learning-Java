package chapter_15.bag.b1.b5;

import chapter_15.bag.b1.b4.Dimension;
import chapter_15.bag.b1.b4.HasColor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:32
 * \* Description:
 * \
 */
public class ColoredDimension2<T extends Dimension & HasColor> extends Color2<T>{

    public ColoredDimension2(T item) {
        super(item);
    }

    int getX(){
        return item.x;
    }
}
