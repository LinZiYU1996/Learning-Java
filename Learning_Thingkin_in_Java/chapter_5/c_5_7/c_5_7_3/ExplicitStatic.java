package chapter_5.c_5_7.c_5_7_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:59 2019/12/25
 */
public class ExplicitStatic {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.c1.f(99); // (1)
    }

    static Cups x = new Cups(); // (2)
    static Cups y = new Cups(); // (2)


}
