package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Sum_Array_Map_and_List_Collection_Example;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:06
 * \* Description:
 * \
 */
public class SumOfListDemo {


    public static void main(String[] args) {

        List<Line> list = new ArrayList<>();
        list.add(new Line(213));
        list.add(new Line(233));
        list.add(new Line(243));
        list.add(new Line(253));
        System.out.println("--Using IntStream.sum()--");

        int sum = list.stream()
                .map(Line::getLength)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
        System.out.println("--Using Collectors.summingInt()--");


        sum = list.stream()
                .map(Line::getLength)
                .collect(Collectors.summingInt(i->i));


        System.out.println(sum);
        System.out.println("--Using summarizingInt()--");

        IntSummaryStatistics summaryStatistics = list.stream()
                .collect(Collectors.summarizingInt(Line::getLength));

        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getMax());
        System.out.println("--Using Stream.reduce() with combiner--");


        sum = list.parallelStream().reduce(0, (output, ob) -> output + ob.getLength(), (a, b) -> a + b);
        System.out.println(sum);




    }
}
