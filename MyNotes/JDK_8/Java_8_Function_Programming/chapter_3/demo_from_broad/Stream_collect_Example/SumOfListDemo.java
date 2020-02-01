package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_collect_Example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:24
 * \* Description:
 * \
 */
public class SumOfListDemo{


    //Stream.collect() also accepts single argument.

    //It is useful to perform many operations like summation, grouping, joining etc. Find the example for summation.

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 43, 12, 25);
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(i -> i + i));
        System.out.println("Sum:"+stats.getSum());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
    }
}
