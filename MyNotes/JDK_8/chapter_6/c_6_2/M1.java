package JDK_8.chapter_6.c_6_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 21:24
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Dish> menu  = Data.create();

//        利用 counting 工厂方法返回的收集器，数一数菜单里有多少
//种菜：

        long howManyDishes = menu.stream()
                .collect(Collectors.counting());

        System.out.println(howManyDishes);

//        还可以写得更为直接：
        long howManyDishes_1 = menu.stream()
                .count();

        System.out.println(howManyDishes_1);


    }
}
