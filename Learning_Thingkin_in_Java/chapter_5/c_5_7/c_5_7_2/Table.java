package chapter_5.c_5_7.c_5_7_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:59 2019/12/24
 */
public class Table {

    static Bowl b1 = new Bowl(1,"YES");

    Table() {
        System.out.println("Table()");
        b2.f(1);
        System.out.println("");
    }


    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }


    static Bowl b2 = new Bowl(2,"YES");


}
