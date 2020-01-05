package chapter_15.c_15_2.c_15_2_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:07 2020/1/5
 */
public class TwoTuple<A,B> {

    public final A first;
    public final B second;
    public TwoTuple(A a, B b) { first = a; second = b; }
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
