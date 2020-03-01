package Effective.P4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/1
 * \* Time: 21:19
 * \* Description:
 * \
 */
public class UtilityClass {


    /*

    很多工具类，成员都是静态的，想拿来直接用，而不需要实例化的

    但是在缺少显示构造函数的时候，编译器会给你默认生成一个构造函数，这样这个类就有可能实例化

    将类做成抽象类来强制该类不被实例化，这是行不通的（因为子类可以实例化，而且你写这个类不又不是用来继承的）

    所以将构造器设置为private来解决问题：

    缺点：不能被子类化（子类不能访问基类的构造函数）


     */

    private UtilityClass() {

        throw new AssertionError();
    }

    // ......

}
