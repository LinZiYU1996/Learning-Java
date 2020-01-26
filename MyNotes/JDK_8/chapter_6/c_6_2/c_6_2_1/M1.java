package JDK_8.chapter_6.c_6_2.c_6_2_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 21:28
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Dish> menu  = Data.create();


        Comparator<Dish> dishCaloriesComparator =
                Comparator.comparingInt(Dish::getCalories);

//        System.out.println(dishCaloriesComparator);

        Optional<Dish> mostCalorieDish =
                menu.stream()
                        .collect(maxBy(dishCaloriesComparator));


        System.out.println(mostCalorieDish.get());
    }
}
