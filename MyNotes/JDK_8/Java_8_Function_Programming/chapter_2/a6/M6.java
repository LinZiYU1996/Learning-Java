package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import java.util.function.DoubleToIntFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:31
 * \* Description:
 * \
 */
public class M6 {

    public static void main(String[] args) {

        DoubleToIntFunction doubleToIntFunction =  d -> Double.valueOf(d).intValue();

        System.out.println(doubleToIntFunction.applyAsInt(1.2));

    }
}
