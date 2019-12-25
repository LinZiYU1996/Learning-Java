package chapter_5.c_5_7.c_5_7_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:00 2019/12/24
 */
public class Cupboard {

    Bowl b3 = new Bowl(3,"NO");

    static Bowl b4 = new Bowl(4,"YES");


    Cupboard() {
        System.out.println("Cupboard()");
        b4.f(2);
        System.out.println("");
    }


    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }


    static Bowl b5 = new Bowl(5,"YES");

}
