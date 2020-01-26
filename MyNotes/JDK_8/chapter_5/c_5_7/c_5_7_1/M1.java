package JDK_8.chapter_5.c_5_7.c_5_7_1;

import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 19:54
 * \* Description:
 * \
 */
public class M1 {

//以下代码直接使用 Stream.of 创建了一个字符串流。然后，你可以将字符串转换为大写，再
//一个个打印出来
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);

    }
}
