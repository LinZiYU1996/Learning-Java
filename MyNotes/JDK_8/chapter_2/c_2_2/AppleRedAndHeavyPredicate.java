package JDK_8.chapter_2.c_2_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:15
 * \* Description:
 * \
 */
public class AppleRedAndHeavyPredicate implements ApplePredicate{


//    农民让你找出所有重量超过150克的红苹果，你只需要创建一
//个类来实现 ApplePredicate 就行了


    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
