package chapter_6.c_6_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:50 2019/12/26
 */
public class Lunch {

    void testPrivate() {
// Can’t do this! Private constructor:
//! Soup1 soup = new Soup1();
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2.access().f();
    }

//    public static Soup1 makeSoup() {
//        return new Soup1();
//    }
}
