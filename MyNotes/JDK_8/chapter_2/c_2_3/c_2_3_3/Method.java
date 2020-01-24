package JDK_8.chapter_2.c_2_3.c_2_3_3;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;
import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;
import JDK_8.chapter_2.c_2_2.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:46
 * \* Description:
 * \
 */
public class Method {

    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


//    使用 Lambda 表达式


    public static void main(String[] args) {

        List<Apple> apples = CreateDataForApple.create_2();

        List<Apple> redApples = filterApples(apples,
                (Apple apple) -> "red".equals(apple.getColor()));

        System.out.println(redApples);

    }
}
