package chapter_15.c_15_9.d;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:47 2020/1/6
 */
public class BasicBounds {

    public static void main(String[] args) {
        Solid<Bounded> solid =
                new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }


}
