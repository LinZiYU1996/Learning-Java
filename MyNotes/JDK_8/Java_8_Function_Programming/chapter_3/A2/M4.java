package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 20:41
 * \* Description:
 * \
 */
public class M4 {

    public static void main(String[] args) {

        Optional<Integer> min = Stream.of(1,2,3,4,5,6)
                .collect(Collectors.minBy(Integer::compare));


        System.out.println(min.get());


    }
}
