package JDK_8.chapter_4.c_4_3.c_4_3_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 17:52
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<String> title = Arrays.asList(
                "Java8", "In", "Action"
        );

        Stream<String> stringStream = title.stream();

        stringStream.forEach(System.out::println);

//        Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        stringStream.forEach(System.out::println);

    }
}
