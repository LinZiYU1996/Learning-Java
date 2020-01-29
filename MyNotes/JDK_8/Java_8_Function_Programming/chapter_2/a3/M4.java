package JDK_8.Java_8_Function_Programming.chapter_2.a3;

import java.util.function.Consumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 22:10
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("hello  ");

        Consumer<StringBuilder> consumer_1 =
                (s) ->
                        s.append("LOL");



        Consumer<StringBuilder> consumer_2 =

                (s) ->
                        s.append("Dota");


        consumer_1.andThen(consumer_2).accept(builder);

        System.out.println(builder.toString());
    }
}
