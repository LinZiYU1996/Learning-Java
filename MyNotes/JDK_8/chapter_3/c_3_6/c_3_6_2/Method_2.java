package JDK_8.chapter_3.c_3_6.c_3_6_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

import java.util.function.BiFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:04
 * \* Description:
 * \
 */
public class Method_2 {

    public static void main(String[] args) {

//        如果你有一个具有两个参数的构造函数 Apple(String color, Integer weight) ，那么
//它就适合 BiFunction 接口的签名，于是你可以这样写：

        BiFunction<String,Integer, Apple> function = Apple::new;

        Apple apple_1 = function.apply("Hokl",45454);

        System.out.println(apple_1);

        System.out.println("====================================");

//        等价于
        BiFunction<String,Integer,Apple> function1  =
                (color,weight) -> new Apple(color,weight);

        Apple apple_2 = function1.apply("jdjs",653456);

        System.out.println(apple_2);

    }
}
