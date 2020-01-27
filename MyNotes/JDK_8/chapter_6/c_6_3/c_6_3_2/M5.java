package JDK_8.chapter_6.c_6_3.c_6_3_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;
import JDK_8.chapter_6.c_6_3.CaloricLevel;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 10:44
 * \* Description:
 * \
 */
public class M5 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();
        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType =

                menu.stream()
                .collect(
                        groupingBy(Dish::getType,
                                mapping(
                                        dish ->
                                        {
                                            if (dish.getCalories()<=400) return CaloricLevel.DIET;
                                            else if (dish.getCalories()<=700) return CaloricLevel.NORMAL;
                                            else return CaloricLevel.FAT;
                                        },
                                        toSet()
                                ))
                );


        System.out.println(caloricLevelsByType);

    }
}
