package JDK_8.method_reference.A3;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 15:13
 * \* Description:
 * \
 */
public class Test1 {

//静态方法引用的语法格式为： 类名::静态方法名 ，如
//System.out::println 等价于lambda表达式 s -> System.out.println(s)


    public static void main(String[] args) {

        Arrays.asList(
                new String[]{"a","b","c"}
        ).stream()
                .forEach(s -> println(s));

        Arrays.asList(
                new String[]{"a","b","c"}
        ).stream()
                .forEach(Test1::println);

    }
//静态方法引用适用于lambda表达式主体中仅仅调用了某个类的静态方法的情形。
    public static void println(String s)
    {
        System.out.println(s);
    }
}
