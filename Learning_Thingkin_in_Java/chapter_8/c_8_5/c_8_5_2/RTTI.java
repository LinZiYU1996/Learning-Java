package chapter_8.c_8_5.c_8_5_2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:41 2019/12/28
 */
public class RTTI {

    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
// Compile time: method not found in Useful:
//! x[1].u();
        ((MoreUseful)x[1]).u(); // Downcast/RTTI
        ((MoreUseful)x[0]).u(); // Exception thrown
    }
}
