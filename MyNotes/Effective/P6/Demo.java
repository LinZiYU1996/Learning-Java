package Effective.P6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/3
 * \* Time: 20:41
 * \* Description:
 * \
 */
public class Demo {

    /*
    最好能重用对象而不是在每次需要的时候就创建一个相同功能的新对象。如果对象是不可变的，它就始终可以被重用。
     */


    public static void main(String[] args) {

        //每次执行该语句时都会创建一个新的String实例，传递给String构造器的参数（“stringette”）本身是一个String实例，功能方面等同于构造器创建的所有对象。如果这种用法是在一个循环中，或者是在一个被频繁调用的方法中，会创建出成千上万不必要的String实例
        String s = new String("stringette");

        /*
        只用了一个String实例，而不是每次执行的时候都创建一个新的实例。对于所有在同一台虚拟机中运行的代码，只要它们包含相同的字符串字面常量，该对象就会被重用
         */
        String ss = "stringette";




    }
}
