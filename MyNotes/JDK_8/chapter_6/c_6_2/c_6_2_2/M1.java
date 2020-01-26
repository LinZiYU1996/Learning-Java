package JDK_8.chapter_6.c_6_2.c_6_2_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;

import static java.util.stream.Collectors.summingInt;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 21:36
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();


//你可以这样求出菜单列表的总热量
        int totalCalories = menu.stream()
                .collect(summingInt(Dish::getCalories));

        System.out.println(totalCalories);

    }
}
