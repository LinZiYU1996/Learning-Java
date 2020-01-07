package chapter_15.c_15_2.demo.d2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:09 2020/1/5
 */
public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
    public final D fourth;
    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        fourth = d;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ")";
    }



}
