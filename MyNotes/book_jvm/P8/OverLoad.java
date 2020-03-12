package book_jvm.P8;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 22:48
 * \* Description:
 * \
 */
public class OverLoad {


    public static void sayHello(Object arg) {
        System.out.println(" hello object");
    }

    public static void sayHello(int arg) {
        System.out.println(" hello int");
    }

    public static void sayHello(long arg) {
        System.out.println(" hello long");
    }

    public static void sayHello(Character arg) {
        System.out.println(" hello character");
    }

    public static void sayHello(char arg) {
        System.out.println("hello char");
    }

    public static void sayHello(char...arg) {
        System.out.println("hello char ... .. .. . .");
    }

    public static void sayHello(Serializable arg) {
        System.out.println("hello Serializable");
    }


    public static void main(String[] args) {

        sayHello('a');

        /*
        hello char
         */

        /*

       'a' 一个char类型数据

       自然去寻找参数类型为char的重载方法

       如果注释掉  sayHello(char arg)方法

       输出：

       hello int

       因此发生了自动类型转换

       'a' 除了代表一个字符串  还可以代表数字 97

       所以找参数为int的方法

       那注释掉int的方法

       输出

       hello long

       因为发生了两次类型转换

       'a'  ->  97

       再次

       --> 97L

       匹配了参数为long的方法

       这种类型转换会按照:

       char ---> int ---> long ---> float ---> double的顺序进行匹配

       把long的方法注释

       输出：

       hello   Character

       因为发生了自动装箱

       'a'  ---> 包装成封装类型  Character

       所以匹配 Character方法

       注释Character方法

       输出:

       hello Serializable


       出现Serializable 是因为

       java.lang.Serializable 是 java.lang.Character类实现的一个接口

       当自动装箱后发现还是找不到装箱类

       但是找到了装箱类实现了的接口类型

       





         */



    }


}
