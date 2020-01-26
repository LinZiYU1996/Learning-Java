package JDK_8.chapter_6.c_6_2.c_6_2_4;


import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 22:25
 * \* Description:
 * \
 */
public class M3 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        int totalCalories = menu.stream()
                .collect(reducing(
                        0,
                        Dish::getCalories,
                        Integer::sum
                ));


        System.out.println(totalCalories);


    }
}
