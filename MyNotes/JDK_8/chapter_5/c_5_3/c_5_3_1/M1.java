package JDK_8.chapter_5.c_5_3.c_5_3_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:36
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        if (menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("isVegetarian");
        }
//anyMatch 方法返回一个 boolean ，因此是一个终端操作
    }
}
