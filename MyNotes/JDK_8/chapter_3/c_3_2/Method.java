package JDK_8.chapter_3.c_3_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;
import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;
import JDK_8.chapter_2.c_2_2.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 10:55
 * \* Description:
 * \
 */

public class Method {

//    那到底在哪里可以使用Lambda呢？你可以在函数式接口上使用Lambda表达式。在上面的代
//码中，你可以把 Lambda表达式作为第二个参数传给 filter 方法，因为它这里需要
//Predicate<T> ，而这是一个函数式接口。



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

    public static void main(String[] args) {

        List<Apple> apples = CreateDataForApple.create_2();

        List<Apple> greenapples = filterApples(
                apples,(apple -> "green".equals(apple.getColor()))
        );

        System.out.println(greenapples);


    }
}
