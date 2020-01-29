package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:18
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = BinaryOperator.minBy(
                Comparator.naturalOrder()
        );

        System.out.println(binaryOperator.apply(100,200));

    }
}
