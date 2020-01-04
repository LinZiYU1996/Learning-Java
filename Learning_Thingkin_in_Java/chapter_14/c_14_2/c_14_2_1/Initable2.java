package chapter_14.c_14_2.c_14_2_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:54 2020/1/4
 */
class Initable2 {

    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }


}
