package JDK_8.chapter_5.c_5_2.c_5_2_2;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:34
 * \* Description:
 * \
 */
public class Test_5_2_3 {

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i ->
                                numbers2.stream()
                                        .filter(j -> (i + j) % 3 == 0)
                                        .map(j -> new int[]{i, j})
                        )
                        .collect(toList());

        System.out.println(pairs);

    }
}
