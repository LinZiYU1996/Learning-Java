package JDK_8.chapter_5.c_5_3.c_5_3_4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:45
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(x -> x * x)
                        .filter(x -> x % 3 == 0)
                        .findFirst(); // 9

        System.out.println(firstSquareDivisibleByThree);
    }
}
