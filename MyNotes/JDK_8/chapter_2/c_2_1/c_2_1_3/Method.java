package JDK_8.chapter_2.c_2_1.c_2_1_3;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;
import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:07
 * \* Description:
 * \
 */
public class Method {

//    一种把所有属性结合起来的笨拙尝试如下所示

    public static List<Apple> filterApples(List<Apple> inventory, String color,
                                           int weight, boolean flag) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory){
            if ( (flag && apple.getColor().equals(color)) ||
                    (!flag && apple.getWeight() > weight) ){
                result.add(apple);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        List<Apple> apples = CreateDataForApple.create_2();

        List<Apple> greenApples = filterApples(apples, "green", 0, true);

        System.out.println(greenApples);

    }

//    这个解决方案再差不过了。首先，客户端代码看上去糟透了。 true 和 false 是什么意思？此
//外，这个解决方案还是不能很好地应对变化的需求。如果这位农民要求你对苹果的不同属性做筛
//选，比如大小、形状、产地等，又怎么办？而且，如果农民要求你组合属性，做更复杂的查询，
//比如绿色的重苹果，又该怎么办？你会有好多个重复的 filter 方法，或一个巨大的非常复杂的
//方法。到目前为止，你已经给 filterApples 方法加上了值（比如 String 、 Integer 或 boolean ）
//的参数。这对于某些确定性问题可能还不错。但如今这种情况下，你需要一种更好的方式，来把
//苹果的选择标准告诉你的 filterApples 方法。在下一节中，我们会介绍了如何利用行为参数化
//实现这种灵活性。




}
