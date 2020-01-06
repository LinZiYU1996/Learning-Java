package chapter_15.c_15_9.d1;

import chapter_15.c_15_9.d.Bounded;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:49 2020/1/6
 */
public class InheritBounds {

    public static void main(String[] args) {
        Solid2<Bounded> solid2 =
                new Solid2<Bounded>(new Bounded());
        solid2.color();
        solid2.getY();
        solid2.weight();
    }


}
