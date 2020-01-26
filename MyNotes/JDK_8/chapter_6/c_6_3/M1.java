package JDK_8.chapter_6.c_6_3;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 22:32
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();


        Map<Dish.Type,List<Dish>> dishesByType =

                menu.stream()
                .collect(groupingBy(Dish::getType));

        System.out.println(dishesByType);

        for (Dish.Type type : dishesByType.keySet()){

            System.out.println(type + " :");
            System.out.println(dishesByType.get(type));
            System.out.println("");
        }


    }
}
