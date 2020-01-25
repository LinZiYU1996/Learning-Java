package JDK_8.chapter_4.c_4_1;

import chapter_15.c_15_7.c_15_7_3.Foo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:41
 * \* Description:
 * \
 */
public class CreateFoodData {

    static String[] strings =

            {

                    "baozi",
                    "bread",
                    "rice",
                    "beef",
                    "noodles",
                    "fish",
                    "eggs",
                    "chicken"

            };

    static Random random = new Random(55);

    public static List<Food> create(){

        List<Food> res = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            res.add(new Food(strings[random.nextInt(strings.length)],random.nextInt(900)));
        }

        return res;
    }
}
