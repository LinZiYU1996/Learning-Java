package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 22:26
 * \* Description:
 * \
 */
public class StaticDispatch {

    /*

    方法静态分派演示

     */

    static abstract class Human {

    }


    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human guy) {
        System.out.println("hello guy");
    }

    public void sayHello(Man guy) {
        System.out.println("hello gentleman");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello lady");
    }

    public static void main(String[] args) {

        Human man = new Man();

        Human woman = new Woman();

        StaticDispatch staticDispatch = new StaticDispatch();

        staticDispatch.sayHello(man);

        staticDispatch.sayHello(woman);

        /*

        Human man = new Man()

        Human 变量的静态类型  或者叫  外观类型


        Man  变量的实际类型

        静态和实际类型在程序中都可以发生变化

        区别是

        静态：

        仅仅在使用时发生 变量本身的静态类型不会被改变 并且最终的静态类型在编译期是可知的

        实际类型变化的结果在运行期才可以确定

        编译器在编译程序时并不知道一个对象的实际类型是什么

        // 实际类型变化

        Human man = new Man();

        man = new Woman();

        // 静态类型变化

        sr.sayHello( (Man) man);

        sr.sayHello( (Woman) man);



        上面例子中：

        main中的两次sayHello方法调用

        在方法接受者已经确定对象是staticDispatch的前提下

        使用哪个重载版本，就完全取决于参数的数量和数据类型

        代码中刻意定义两个：

        静态类型相同  实际类型不同的变量

        但是编译器在重载时是通过参数的静态类型而不是实际类型作为判断依据的

        并且静态类型是编译器可知的

        因此，编译阶段，Javac编译器会根据参数的静态类型决定使用哪个重载版本

        所以选择了sayHello(Human)作为调用目标

         */

    }

}
