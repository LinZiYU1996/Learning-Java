package JDK_8.chapter_6.c_6_3.c_6_3_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 10:32
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        Map<Dish.Type, Optional<Dish>> mostCaloricByType =

                menu.stream()
                .collect(
                        groupingBy(Dish::getType
                        ,
                                maxBy(Comparator.comparingInt(Dish::getCalories)))
                );


        System.out.println(mostCaloricByType);
    }


}
