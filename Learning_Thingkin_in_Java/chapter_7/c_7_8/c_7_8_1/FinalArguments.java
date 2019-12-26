package chapter_7.c_7_8.c_7_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:31 2019/12/26
 */
public class FinalArguments {

    void with(final Gizmo g) {
//! g = new Gizmo(); // Illegal -- g is final
    }
    void without(Gizmo g) {
        g = new Gizmo(); // OK -- g not final
        g.spin();
    }
    // void f(final int i) { i++; } // Can’t change
// You can only read from a final primitive:
    int g(final int i) { return i + 1; }
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
