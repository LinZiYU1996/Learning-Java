package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 20:43
 * \* Description:
 * \
 */
public class M5 {

    public static void main(String[] args) {

        double average = Stream.of(1,2,3,4,5)
                .collect(Collectors.averagingInt(x->x));

        System.out.println(average);
    }
}
