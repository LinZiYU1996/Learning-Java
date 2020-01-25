package JDK_8.chapter_5.c_5_2.c_5_2_1;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 20:01
 * \* Description:
 * \
 */
public class M1 {

//    下面的代码把方法引用 Dish::getName 传给了 map 方法，
//来提取流中菜肴的名称：

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        List<String> names = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
