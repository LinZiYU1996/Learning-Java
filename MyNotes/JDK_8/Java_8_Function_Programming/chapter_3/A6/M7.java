package JDK_8.Java_8_Function_Programming.chapter_3.A6;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 19:59
 * \* Description:
 * \
 */
public class M7 {

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 0)
                .skip(3)
                .forEach(System.out::println);
//上面的代码中，获取流中的偶数，并跳过前3个
    }
}
