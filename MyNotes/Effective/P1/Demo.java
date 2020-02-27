package Effective.P1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/27
 * \* Time: 20:45
 * \* Description:
 * \
 */
public class Demo {

    /*
    用静态工厂方法代替构造器
     */

    // 这个方法与设计模式中的工厂方法不同   并不直接对应于设计模式
    // 中的工厂方法

//    静态工厂方法与构造器不同的第一大优势在于   它们有名称

//    第二大优势   不必在每次调用它们的时候都创建一个新对象


    //  Boolean.valueof 方法从来不创建对象   这种方法类似于享元模式

    //  第三大优势   可以返回    原返回类型的任何子类型的对象



    public static Boolean valueof(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
