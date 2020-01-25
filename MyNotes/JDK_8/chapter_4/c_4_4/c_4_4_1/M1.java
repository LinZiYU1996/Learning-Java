package JDK_8.chapter_4.c_4_4.c_4_4_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 18:01
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        List<String> names =

                menu.stream()
                .filter(dish ->
                {
                    System.out.println("filter  " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish ->
                {
                    System.out.println("map   " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toList());


        System.out.println("=====================================");
        System.out.println(names);


    }
}
