package JDK_8.chapter_4.c_4_1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:46
 * \* Description:
 * \
 */
public class M2 {



    public static void main(String[] args) {

        List<Food> foods = CreateFoodData.create();

        List<String> lowCaloricfoodName =
                foods.stream()
                .filter(d -> d.getCalory() < 400)
                .sorted(Comparator.comparing(Food::getCalory))
                .map(Food::getName)
                .collect(Collectors.toList());

        System.out.println(lowCaloricfoodName);

    }
}
