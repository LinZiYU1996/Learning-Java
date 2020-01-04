package chapter_14.c_14_2.c_14_2_1;

import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:54 2020/1/4
 */
public class ClassInitialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {

//        初始化有效地实现了尽可能的＂惰性”。从对initable引用的创建中可以看到，
//        仅使用.class语法来获得对类的引用不会引发初始化。但是，为了产生Class引用，
//        Ciass.forNameO立即就进
//        行了初始化，就像在对initabie3引用的创建中所看到的．
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");

//初始化，就像在对initabie3引用的创建中所看到的．
//如果-个staticfinal值是“编译期常盐＂，
// 就像Initable.s.taticFinal那样，那么这个值不需要 对initable类进行初始化就可以被读取。
// 但是，如果只是将一个域设置为static和final的，还不足
//        以确保这种行为，例如，对lnitable.staticFinal2的访问将强制进行类的初始化
//        ，因为它不是一个编译期常量。


// Does not trigger initialization:
        System.out.println(Initable.staticFinal);

// Does trigger initialization:
        System.out.println(Initable.staticFinal2);

//        如果一个static域不是final的，那么在对它访间时，总是要求在它被读取之前，
//        要先进行链接（为这个域分配存储空间）和初始化（初始化该存储空间），
//        就像在对Initable2.staticNonFinal 的访间中所看到的那样。

// Does trigger initialization:
        System.out.println(Initable2.staticNonFinal);

        Class initable3 = Class.forName("Initable3");

        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }

}
