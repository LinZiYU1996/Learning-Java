package JDK_8.chapter_5.c_5_2.c_5_2_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:31
 * \* Description:
 * \
 */
public class Test_5_2_2 {

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);

        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> pairs =
                numbers1.stream()
                .flatMap(i -> numbers2.stream()
                .map( j -> new int[]{i,j}))
                .collect(Collectors.toList());

        System.out.println(pairs);

    }
}
