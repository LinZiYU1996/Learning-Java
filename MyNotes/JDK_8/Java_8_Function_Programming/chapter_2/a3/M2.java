package JDK_8.Java_8_Function_Programming.chapter_2.a3;

import java.util.function.Consumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 22:06
 * \* Description:
 * \
 */
public class M2 {

    public static void consumer_1(double num){

        method(num,
                (m) ->
                        System.out.println("花了 " + m + "  RMB"));
    }

    public static void method(double number, Consumer<Double> consumer){
        consumer.accept(number);
    }

    public static void main(String[] args) {

        consumer_1(555);

    }
}
