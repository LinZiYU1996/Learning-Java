package chapter_15.c_15_4.c_15_4_5;

import chapter_15.c_15_2.c_15_2_1.FiveTuple;
import chapter_15.c_15_2.c_15_2_1.FourTuple;
import chapter_15.c_15_2.c_15_2_1.ThreeTuple;
import chapter_15.c_15_2.c_15_2_1.TwoTuple;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:12 2020/1/5
 */
public class Tuple {


    public static <A,B> TwoTuple<A,B> tuple(A a, B b) {
        return new TwoTuple<A,B>(a, b);
    }


    public static <A,B,C> ThreeTuple<A,B,C>
    tuple(A a, B b, C c) {
        return new ThreeTuple<A,B,C>(a, b, c);
    }


    public static <A,B,C,D> FourTuple<A,B,C,D>
    tuple(A a, B b, C c, D d) {
        return new FourTuple<A,B,C,D>(a, b, c, d);
    }


    public static <A,B,C,D,E>
    FiveTuple<A,B,C,D,E> tuple(A a, B b, C c, D d, E e) {
        return new FiveTuple<A,B,C,D,E>(a, b, c, d, e);
    }


}
