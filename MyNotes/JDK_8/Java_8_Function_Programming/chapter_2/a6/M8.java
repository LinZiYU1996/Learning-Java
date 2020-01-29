package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import java.util.function.BiConsumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:48
 * \* Description:
 * \
 */
public class M8 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        BiConsumer<String,String> biConsumer =
                (a,b) ->
                {
                  builder.append(a);
                  builder.append(b);
                };


        biConsumer.accept("hello  ","  world");

        System.out.println(builder.toString());
    }
}
