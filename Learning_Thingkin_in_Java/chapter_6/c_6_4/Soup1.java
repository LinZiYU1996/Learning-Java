package chapter_6.c_6_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:50 2019/12/26
 */
public class Soup1 {

    private Soup1() {}
    // (1) Allow creation via static method:
    public static Soup1 makeSoup() {
        return new Soup1();
    }


}
