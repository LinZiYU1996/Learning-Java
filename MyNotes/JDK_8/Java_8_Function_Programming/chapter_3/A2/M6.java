package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 20:46
 * \* Description:
 * \
 */
public class M6 {

    public static void main(String[] args) {

        int sum = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.summingInt(x->x));

        System.out.println(sum);


    }
}
