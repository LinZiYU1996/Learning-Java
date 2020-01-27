package JDK_8.chapter_6.c_6_6.c_6_6_1;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 13:03
 * \* Description:
 * \
 */
public class M2 {


    public static Map<Boolean, List<Integer>>
    partitionPrimesWithCustomCollector(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(new PrimeNumbersCollector());
    }


    public static void main(String[] args) {

        System.out.println(partitionPrimesWithCustomCollector(500));

    }
}
