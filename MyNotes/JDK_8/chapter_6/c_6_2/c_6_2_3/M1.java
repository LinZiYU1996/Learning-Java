package JDK_8.chapter_6.c_6_2.c_6_2_3;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 21:43
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {
//把菜单中所有菜肴的名称连接起来

        List<Dish> menu = Data.create();

        String shortMenu = menu.stream()
                .map(Dish::getName).collect(joining());


        System.out.println(shortMenu);

        String shortMenu_1 = menu.stream()
                .map(Dish::getName)
                .collect(joining(", "));

        System.out.println(shortMenu_1);


    }
}
