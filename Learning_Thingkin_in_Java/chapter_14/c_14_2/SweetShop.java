package chapter_14.c_14_2;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:48 2020/1/4
 */
public class SweetShop {


//    每个类Candy、 Gum和Cookie, 都有一个static子句，
//    该子句在类第一次被加载时执行。这时会有相应的信息打印出来，
//    告诉我们这个类什么时候被加载了。在main()中， 创建对象的代码被置于打印语句之间，
//    以帮助我们判断加载的时间点。

//    Class对象仅在需要的时候才被加载， static初始化是在类加载时进行的。
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {

//            这个方法是Class类（所有Class对象都属于这个类） 的一个static成员。

//            forName()是取得Class 对象的引用的一种方法。
//            它是用一个包含目标类的文本名（注意拼写和大小写）的String作输人参数，
//            返回的是一个Class对象的引用， 上面的代码忽略了返回值。
//            对forNameO的调用是为了它产生的 ＂副作用”：如果类Gum还没有被加载就加载它。
//            在加载的过程中， Gum的static子旬被执行。

//            无论何时， 只要你想在运行时使用类型信息， 就必须首先获得对恰当的Class对象的引用。
//            Class.forN ame()就是实现此功能的便捷途径，
//            因为你不需要为了获得Class引用而持有该类型的对象。
            Class.forName("Gum");
        } catch(ClassNotFoundException e) {
            print("Couldn’t find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
    }


}
