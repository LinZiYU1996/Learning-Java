package JDK_8.chapter_5.c_5_1.c_5_1_4;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 19:57
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        List<Dish> dishes = menu.stream()
                .filter(dish -> dish.getCalories() > 500)
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(dishes);
    }
}
