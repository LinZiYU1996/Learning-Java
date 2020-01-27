package JDK_8.chapter_6.c_6_4;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 10:50
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        List<Dish> vegetarianDishes =
                menu.stream().filter(Dish::isVegetarian).collect(toList());

        System.out.println(vegetarianDishes);

    }
}
