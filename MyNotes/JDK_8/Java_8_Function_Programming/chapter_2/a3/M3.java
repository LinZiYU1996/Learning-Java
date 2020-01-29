package JDK_8.Java_8_Function_Programming.chapter_2.a3;

import java.util.function.Consumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 22:08
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("hello");

        Consumer<StringBuilder> consumer = (s) ->
                s.append("  world");

        consumer.accept(builder);

        System.out.println(builder.toString());
    }
}
