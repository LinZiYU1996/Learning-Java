package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:36 2019/12/25
 */
public class OverloadingVarargs3 {

    static void f(float i, Character... args) {
        System.out.println("first");
    }
    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
//    如果您为这两个方法都提供了一个非可变参数，那么它将起作用：

}
