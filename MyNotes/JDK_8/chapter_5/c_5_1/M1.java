package JDK_8.chapter_5.c_5_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 18:11
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

//筛选出所有素菜，创建一张素食菜单：
        List<Dish> menu = Data.create();

        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

    }
}
