package JDK_8.chapter_3.c_3_6.c_3_6_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 16:02
 * \* Description:
 * \
 */
public class Method_1 {

    public static List<Apple> map(List<Integer> list,
                                  Function<Integer, Apple> f){
        List<Apple> result = new ArrayList<>();
        for(Integer e: list){
            result.add(f.apply(e));
        }
        return result;
    }

    public static void main(String[] args) {


//在下面的代码中，一个由 Integer 构成的 List 中的每个元素都通过我们前面定义的类似的
//map 方法传递给了 Apple 的构造函数，得到了一个具有不同重量苹果的 List


        List<Integer> weights = Arrays.asList(
                14,5966,455,220,4478
        );

        List<Apple> apples = map(weights,Apple::new);

        for (Apple apple : apples){
            System.out.println(apple);
        }


    }
}
