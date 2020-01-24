package JDK_8.chapter_2.c_2_2;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:12
 * \* Description:
 * \
 */
public class AppleGreenColorPredicate implements ApplePredicate{
//算法族就是 ApplePredicate ，不同的策略就是 AppleHeavyWeightPredicate 和 AppleGreen-
//ColorPredicate 。
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
