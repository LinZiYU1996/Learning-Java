package chapter_5.c_5_7.c_5_7_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:57 2019/12/25
 */


//Java 允许我们将其他static初始化工作划分到类内一个特殊的“static 构建从句”（有时也叫作“静态
//        块”）里。它看起来象下面这个样子：

public class Spoon {

    static int i;
    static {
        i = 47;
    }
//    尽管看起来象个方法，但它实际只是一个static 关键字，后面跟随一个方法主体。与其他 static初始化一
//    样，这段代码仅执行一次——首次生成那个类的一个对象时，或者首次访问属于那个类的一个 static 成员时
//（即便从未生成过那个类的对象）。
}
