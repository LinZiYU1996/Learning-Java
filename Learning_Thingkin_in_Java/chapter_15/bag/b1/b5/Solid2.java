package chapter_15.bag.b1.b5;

import chapter_15.bag.b1.b4.Dimension;
import chapter_15.bag.b1.b4.HasColor;
import chapter_15.bag.b1.b4.Weight;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:33
 * \* Description:
 * \
 */
public class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T>{

    public Solid2(T item) {
        super(item);
    }

    int weight(){
        return item.weight();
    }
}
