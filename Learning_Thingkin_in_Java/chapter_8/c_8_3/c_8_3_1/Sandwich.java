package chapter_8.c_8_3.c_8_3_1;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:13 2019/12/27
 */
public class Sandwich extends PortableLunch{

    private Bread b = new Bread();

    private Cheese c = new Cheese();

    private Lettuce l = new Lettuce();

    public Sandwich() { print("Sandwich()\n"); }


    public static void main(String[] args) {
        new Sandwich();
    }


}
