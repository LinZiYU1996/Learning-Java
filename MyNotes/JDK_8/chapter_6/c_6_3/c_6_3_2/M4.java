package JDK_8.chapter_6.c_6_3.c_6_3_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 10:41
 * \* Description:
 * \
 */
public class M4 {


    public static void main(String[] args) {


//求出所有菜肴热量总和的收集器，不过这次是对
//每一组 Dish 求和

        List<Dish> menu = Data.create();

        Map<Dish.Type, Integer> totalCaloriesByType =

                menu.stream()
                .collect(groupingBy(Dish::getType,
                        summingInt(Dish::getCalories)));


        System.out.println(totalCaloriesByType);



    }
}
