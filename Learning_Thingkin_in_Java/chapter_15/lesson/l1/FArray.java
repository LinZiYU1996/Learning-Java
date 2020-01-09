package chapter_15.lesson.l1;

import chapter_15.c_15_3.Generator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 11:05
 * \* Description:
 * \
 */
public class FArray {

    public static <T> T[] fill(T[] a, Generator<T> generator){
        for (int i = 0; i < a.length; i++) {
            a[i] = generator.next();
        }
        return a;
    }


}
