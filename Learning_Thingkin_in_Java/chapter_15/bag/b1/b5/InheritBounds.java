package chapter_15.bag.b1.b5;

import chapter_15.bag.b1.b4.Bounded;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:34
 * \* Description:
 * \
 */
public class InheritBounds {

    public static void main(String[] args) {


        Solid2<Bounded> solid2 = new
                Solid2<>(new Bounded());

        solid2.color();

        solid2.getX();

        solid2.weight();
    }
}
