package JDK_8.chapter_5.c_5_3.c_5_3_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:38
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        boolean isOk = menu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);

        System.out.println(isOk);

    }
}
