package chapter_15.bag.b1.b4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:26
 * \* Description:
 * \
 */
public class BasicBounds {

    public static void main(String[] args) {


        Solid<Bounded> solid =
                new Solid<>(new Bounded());

        solid.color();

        solid.getX();

        solid.weight();

    }
}
