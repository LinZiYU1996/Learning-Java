package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Sum_Array_Map_and_List_Collection_Example;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:10
 * \* Description:
 * \
 */
public class SumOfMapValues {


    public static void main(String[] args) {


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 12);
        map.put(2, 24);
        map.put(3, 10);
        System.out.println("--Using IntStream.sum()--");

        int sum = map.values()
                .stream()
                .mapToInt(i->i)
                .sum();

        System.out.println(sum);
        System.out.println("--Using BinaryOperator--");

        sum = map.values()
                .stream()
                .reduce(0,Integer::sum);


        System.out.println(sum);
        System.out.println("--Using Collectors.summingInt()--");

        sum = map.values()
                .stream()
                .collect(Collectors.summingInt(i->i));

        System.out.println(sum);
        System.out.println("--Using Collectors.summarizingInt()--");


        IntSummaryStatistics stats = map.values()
                .stream()
                .collect(Collectors.summarizingInt(i->i));


        System.out.println(stats.getSum());
        System.out.println("--Using custom method--");
        sum = map.values().stream().reduce(0, StatisticsUtility::addIntData);
        System.out.println(sum);




    }
}
