package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:35 2019/12/25
 */
public class OverloadingVarargs2 {

//    您可以尝试通过向其中一种方法添加non-vararg参数来解决问题：
    static void f(float i, Character... args) {
        System.out.println("first");
    }
    static void f(Character... args) {
        System.out.print("second");
    }
//    public static void main(String[] args) {
//        f(1, 'a');
//        f('a', 'b');
//    }

//报错：
//
//    Error:(18, 9) java: 对f的引用不明确
//    chapter_5.c_5_8.c_5_8_1.OverloadingVarargs2 中的方法 f(float,java.lang.Character...) 和 chapter_5.c_5_8.c_5_8_1.OverloadingVarargs2 中的方法 f(java.lang.Character...) 都匹配

}
