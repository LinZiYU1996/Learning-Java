package JDK_8.chapter_6.c_6_3;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;
import jdk.nashorn.internal.ir.IfNode;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 22:40
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();


        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel =

                menu.stream()
                .collect(

                        groupingBy(dish ->
                        {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return  CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })

                );


        System.out.println(dishesByCaloricLevel);


    }
}
