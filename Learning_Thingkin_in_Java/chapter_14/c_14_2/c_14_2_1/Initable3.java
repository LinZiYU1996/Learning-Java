package chapter_14.c_14_2.c_14_2_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:54 2020/1/4
 */
class Initable3 {

    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }


}
