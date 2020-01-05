package chapter_15.c_15_2.c_15_2_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:09 2020/1/5
 */
public class FiveTuple<A,B,C,D,E>
        extends FourTuple<A,B,C,D> {
    public final E fifth;
    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + ")";
    }

}
