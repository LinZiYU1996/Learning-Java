package JDK_8.chapter_2.c_2_1.c_2_1_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;
import JDK_8.chapter_2.c_2_1.c_2_1_1.CreateDataForApple;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 21:57
 * \* Description:
 * \
 */
public class Method {


//    把颜色作为参数

    public static List<Apple> filterApplesByColor(List<Apple> inventory,
                                                  String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory){
            if ( apple.getColor().equals(color) ) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Apple> apples = CreateDataForApple.create();


        System.out.println(filterApplesByColor(apples,"blue"));


    }

//    太简单了对吧？让我们把例子再弄得复杂一点儿。这位农民又跑回来和你说：“要是能区分
//轻的苹果和重的苹果就太好了。重的苹果一般是重量大于150克。”
//作为软件工程师，你早就想到农民可能会要改变重量，于是你写了下面的方法，用另一个参
//数来应对不同的重量：

//    Method2


}
