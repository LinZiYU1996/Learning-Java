package JDK_8.chapter_2.c_2_2.test_2_1;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/24
 * \* Time: 22:18
 * \* Description:
 * \
 */
public class AppleFancyFormatter implements AppleFormatter{


    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" :
                "light";
        return "A " + characteristic +
                " " + apple.getColor() +" apple";
    }
}
