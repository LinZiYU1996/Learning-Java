package JDK_8.chapter_3.c_3_6.c_3_6_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 15:53
 * \* Description:
 * \
 */
public class Method {

    public static void main(String[] args) {

//        构造函数引用指向默认
//的 Apple() 构造函数
        Supplier<Apple> appleSupplier = Apple::new;

//调用 Supplier 的 get 方法
//将产生一个新的 Apple
        Apple apple = appleSupplier.get();

        System.out.println(apple);

        System.out.println("==========================");

//        等价于

        Supplier<Apple> appleSupplier1 = () -> new Apple();

        Apple apple1 = appleSupplier.get();



//        如果你的构造函数的签名是 Apple(Integer weight) ，那么它就适合 Function 接口的签
//名，于是你可以这样写：
        Function<Integer,Apple> function = Apple::new;

        Apple apple2 = function.apply(100);

        System.out.println(apple2);

        System.out.println("==========================");

//这就等价于

        Function<Integer,Apple> function2 = (weight) -> new Apple(weight);

        Apple apple3 = function2.apply(100);

        System.out.println(apple3);





    }
}
