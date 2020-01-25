package JDK_8.chapter_4.c_4_3.c_4_3_2;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 17:55
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        List<String> names = new ArrayList<>();
        for(Dish d: menu){
            names.add(d.getName());
        }

        System.out.println(names);

        System.out.println("===========================");

//        for-each 结构是一个语法糖，它背后的
//东西用 Iterator 对象表达出来更要丑陋得多

        List<String> names_1 = new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while(iterator.hasNext()) {
            Dish d = iterator.next();
            names_1.add(d.getName());
        }

        System.out.println(names_1);

//        流：内部迭代

        System.out.println("===========================");


        List<String> names_3 = menu.stream()
                .map(Dish::getName)
                .collect(toList());

        System.out.println(names_3);

    }
}
