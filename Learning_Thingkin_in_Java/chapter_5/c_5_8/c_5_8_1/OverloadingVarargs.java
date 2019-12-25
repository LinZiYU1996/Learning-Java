package chapter_5.c_5_8.c_5_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:33 2019/12/25
 */
public class OverloadingVarargs {

//    Varargs使重载过程复杂化，尽管起初看起来很安全：

    static void f(Character... args) {
        System.out.print("first");
        for(Character c : args)
            System.out.print(" " + c);
        System.out.println();
    }
    static void f(Integer... args) {
        System.out.print("second");
        for(Integer i : args)
            System.out.print(" " + i);
        System.out.println();
    }
    static void f(Long... args) {
        System.out.println("third");
    }
    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
//! f(); // Won’t compile -- ambiguous

//        在每种情况下，编译器都使用自动装箱来匹配重载的方法，并且它会调用
//        最具体的匹配方法。
//        但是，当您在不带参数的情况下调用f（）时，它无法知道要调用哪个。
//        尽管此错误是可以理解的，但它可能会使客户端程序员感到惊讶。
    }
}
