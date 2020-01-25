package JDK_8.chapter_5.c_5_6.c_5_6_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.OptionalInt;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 22:30
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        OptionalInt maxCalories =
                menu.stream()
                .mapToInt(Dish::getCalories)
                .max();

        System.out.println(maxCalories);


    }
}
