package JDK_8.chapter_4.c_4_2;

import JDK_8.chapter_4.c_4_1.Food;
import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:53
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Dish> menus = Data.create();

        List<String> threeHighCaloricDishNames =

                menus.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());


        System.out.println(threeHighCaloricDishNames);


    }
}
