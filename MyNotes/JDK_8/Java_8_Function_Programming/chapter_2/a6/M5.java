package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import java.util.function.UnaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:26
 * \* Description:
 * \
 */
public class M5 {

    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = greet -> greet + "hello ";

        System.out.println(unaryOperator.apply("world"));

        System.out.println(UnaryOperator.identity());
    }
}
