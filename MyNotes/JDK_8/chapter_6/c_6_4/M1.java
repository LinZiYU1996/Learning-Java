package JDK_8.chapter_6.c_6_4;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 10:48
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();
        Map<Boolean, List<Dish>> partitionedMenu =

                menu.stream()
                .collect(partitioningBy(Dish::isVegetarian));

        System.out.println(partitionedMenu);

    }
}
