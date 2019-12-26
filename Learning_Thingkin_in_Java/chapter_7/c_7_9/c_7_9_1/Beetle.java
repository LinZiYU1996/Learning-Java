package chapter_7.c_7_9.c_7_9_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:38 2019/12/26
 */
public class Beetle extends Insect{



    private int k = printInit("Beetle.k initialized");


    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }


    private static int x2 =
            printInit("static Beetle.x2 initialized");


    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
