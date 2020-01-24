package JDK_8.chapter_2.c_2_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:13
 * \* Description:
 * \
 */
public class Method {

//    利用 ApplePredicate 的不同实现呢？你需要 filterApples 方法接受
//ApplePredicate 对象，对 Apple 做条件测试。这就是行为参数化：让方法接受多种行为（或战
//略）作为参数，并在内部使用，来完成不同的行为。




//    根据抽象条件筛选


    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


}
