package JDK_8.chapter_8.c_8_1.c_8_1_3;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;
import JDK_8.chapter_6.c_6_3.CaloricLevel;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:15
 * \* Description:
 * \
 */
public class M1 {


//    按照食物的热量级别对菜肴进行分类
    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel =

                        menu.stream()
                .collect(
                        groupingBy(dish ->
                        {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })
                );


        System.out.println(dishesByCaloricLevel);


        System.out.println("=========================");


        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel_1 =

//                将Lambda表达式//抽取到一个方法内
                menu.stream().collect(groupingBy(Dish::getCaloricLevel));

    }
}
