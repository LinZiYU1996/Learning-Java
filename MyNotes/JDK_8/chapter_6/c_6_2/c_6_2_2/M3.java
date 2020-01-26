package JDK_8.chapter_6.c_6_2.c_6_2_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.IntSummaryStatistics;
import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 21:41
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        IntSummaryStatistics  menuStatistics =

                menu.stream()
                .collect(summarizingInt(Dish::getCalories));

        System.out.println(menuStatistics);
//IntSummaryStatistics{count=9, sum=4200, min=120, average=466.666667, max=800}

    }
}
