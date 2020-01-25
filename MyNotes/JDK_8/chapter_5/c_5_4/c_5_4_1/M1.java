package JDK_8.chapter_5.c_5_4.c_5_4_1;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:57
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                121,454,55,66
        );

        int sum = numbers.stream()
                .reduce(0,(a,b) -> a +b );

        System.out.println(sum);

    }
}
