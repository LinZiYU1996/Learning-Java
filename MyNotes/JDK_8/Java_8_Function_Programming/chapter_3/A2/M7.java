package JDK_8.Java_8_Function_Programming.chapter_3.A2;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 20:47
 * \* Description:
 * \
 */
public class M7 {


    public static void main(String[] args) {

        DoubleSummaryStatistics summaryStatistics = Stream.of(1,2,3,4,5,6)
                .collect(Collectors.summarizingDouble(x->x));

        System.out.println(summaryStatistics.getMax());

        System.out.println(summaryStatistics.getAverage());

        System.out.println(summaryStatistics.getMin());

        System.out.println(summaryStatistics.getSum());

    }
}
