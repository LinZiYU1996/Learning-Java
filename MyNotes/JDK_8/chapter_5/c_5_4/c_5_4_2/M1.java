package JDK_8.chapter_5.c_5_4.c_5_4_2;

import chapter_16.demo.d4.CopyingArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 21:11
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                121,454,55,66
        );

        Optional<Integer> max =
                numbers.stream()
                .reduce(Integer::max);

        System.out.println(max);


    }
}
