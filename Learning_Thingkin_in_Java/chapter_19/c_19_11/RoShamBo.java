package chapter_19.c_19_11;

import chapter_19.c_19_6.Enums;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 20:02
 * \* Description:
 * \
 */
public class RoShamBo {

    public static <T extends Competitor<T>>
    void match(T a, T b) {
        System.out.println(
                a + " vs. " + b + ": " + a.compete(b));
    }
    public static <T extends Enum<T> & Competitor<T>>
    void play(Class<T> rsbClass, int size) {
        for(int i = 0; i < size; i++)
            match(
                    Enums.random(rsbClass),Enums.random(rsbClass));
    }
}
