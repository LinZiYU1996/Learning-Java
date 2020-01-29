package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import java.util.function.BiConsumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:51
 * \* Description:
 * \
 */
public class M9 {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        BiConsumer<String, String> biConsumer = (a, b) -> {
            sb.append(a);
            sb.append(b);
        };
        BiConsumer<String, String> biConsumer1 = (a, b) -> {
            System.out.println(a + b);
        };
        biConsumer.andThen(biConsumer1).accept("Hello", " Jack!");

    }
}
