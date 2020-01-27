package JDK_8.chapter_6.c_6_4.c_6_4_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 10:52
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();
        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType =

                menu.stream()
                .collect(
                        partitioningBy(
                                Dish::isVegetarian,
                                groupingBy(Dish::getType)
                        )
                );


        System.out.println(vegetarianDishesByType);
    }

//    这里，对于分区产生的素食和非素食子流，分别按类型对菜肴分组，得到了一个二级 Map


}
