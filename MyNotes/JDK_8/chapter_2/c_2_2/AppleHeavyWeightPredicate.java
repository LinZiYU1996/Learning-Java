package JDK_8.chapter_2.c_2_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:11
 * \* Description:
 * \
 */
public class AppleHeavyWeightPredicate implements ApplePredicate{

//    仅仅选出
//重的苹果
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
