package JDK_8.chapter_4.c_4_1;

import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:39
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        List<Food> foods = CreateFoodData.create();

        List<Food> lowCaloricfoods = new ArrayList<>();

        for(Food food : foods){
                if (food.getCalory() < 400){
                    lowCaloricfoods.add(food);
                }
        }


//        用匿名类对
//菜肴排序
        Collections.sort(lowCaloricfoods, new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return Integer.compare(o1.getCalory(),o2.getCalory());
            }
        });

        System.out.println(lowCaloricfoods);

//        用了一个“垃圾变量” lowCaloricfoods 。它唯一的作用就是作为一次
//性的中间容器


    }
}
