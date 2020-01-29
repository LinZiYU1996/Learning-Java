package JDK_8.Java_8_Function_Programming.chapter_2.a3;

import java.util.function.Consumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 21:59
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("jfjfj");
    }
}
