package chapter_5.c_5_8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:16 2019/12/25
 */
public class ArrayInit {

    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                new Integer(3),
        };
// Java 1.1 only:
        Integer[] b = new Integer[] {
                new Integer(1),
                new Integer(2),
                new Integer(3),
        };
    }
//
//    这种做法大多数时候都很有用，但限制也是最大的，因为数组的大小是在编译期间决定的。初始化列表的最
//    后一个逗号是可选的（这一特性使长列表的维护变得更加容易）。
//    数组初始化的第二种形式（Java 1.1 开始支持）提供了一种更简便的语法，可创建和调用方法，获得与C 的
//“变量参数列表”（C 通常把它简称为“变参表”）一致的效果。这些效果包括未知的参数（自变量）数量
//    以及未知的类型（如果这样选择的话）。

}
