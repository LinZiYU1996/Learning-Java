package JDK_8.chapter_6.c_6_2.c_6_2_4;

import JDK_8.chapter_4.commondata.Data;
import JDK_8.chapter_4.commondata.Dish;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/26
 * \* Time: 22:21
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        List<Dish> menu = Data.create();

        Optional<Dish> mostCalorieDish =

                menu.stream()
                .collect(reducing(
                        (d1,d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2
                ));

        System.out.println(mostCalorieDish);

    }
}
