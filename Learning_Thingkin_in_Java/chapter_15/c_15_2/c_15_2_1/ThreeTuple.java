package chapter_15.c_15_2.c_15_2_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:08 2020/1/5
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B>{

    public final C third;
    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
