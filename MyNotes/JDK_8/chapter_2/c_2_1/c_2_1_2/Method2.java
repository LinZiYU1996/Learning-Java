package JDK_8.chapter_2.c_2_1.c_2_1_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:04
 * \* Description:
 * \
 */
public class Method2 {

    public static List<Apple> filterApplesByWeight(List<Apple> inventory,
                                                   int weight) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory){
            if ( apple.getWeight() > weight ){
                result.add(apple);
            }
        }
        return result;
    }



//    解决方案不错，但是请注意，你复制了大部分的代码来实现遍历库存，并对每个苹果应用筛
//选条件。这有点儿令人失望，因为它打破了DRY（Don’t Repeat Yourself，不要重复自己）的软件
//工程原则。如果你想要改变筛选遍历方式来提升性能呢？那就得修改所有方法的实现，而不是只
//改一个。从工程工作量的角度来看，这代价太大了。




}
