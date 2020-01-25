package JDK_8.chapter_5.c_5_6.c_5_6_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 22:24
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        int calories =

                menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
    }
}
