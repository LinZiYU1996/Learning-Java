package chapter_7.c_7_2.c_7_2_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:19 2019/12/26
 */
public class Chess extends BoardGame{

    Chess() {
        super(11);
//        System.out.println(i);
        print("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }


}
