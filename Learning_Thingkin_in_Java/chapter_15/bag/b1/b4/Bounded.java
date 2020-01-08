package chapter_15.bag.b1.b4;

import java.awt.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:26
 * \* Description:
 * \
 */
public class Bounded extends Dimension implements HasColor,Weight{

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
