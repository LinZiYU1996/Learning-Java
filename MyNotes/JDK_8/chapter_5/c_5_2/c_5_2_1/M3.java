package JDK_8.chapter_5.c_5_2.c_5_2_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:04
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        List<Integer> names = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
