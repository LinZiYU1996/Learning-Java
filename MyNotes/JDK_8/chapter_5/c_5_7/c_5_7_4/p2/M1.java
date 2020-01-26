package JDK_8.chapter_5.c_5_7.c_5_7_4.p2;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 20:06
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
