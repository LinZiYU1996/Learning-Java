package JDK_8.chapter_2.c_2_2.test_2_1;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:19
 * \* Description:
 * \
 */
public class AppleSimpleFormatter implements AppleFormatter{

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
