package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import java.util.function.DoubleUnaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 11:21
 * \* Description:
 * \
 */
public class M4 {

    public static void main(String[] args) {

        DoubleUnaryOperator doubleUnaryOperator = d -> d + 2.50;

        System.out.println(doubleUnaryOperator.applyAsDouble(2.3));

        System.out.println("=================================================");

        DoubleUnaryOperator doubleUnaryOperator1 = doub -> doub + 2.5;

        DoubleUnaryOperator doubleUnaryOperator2 = doub -> doub * 3;

        double result = doubleUnaryOperator1.andThen(doubleUnaryOperator2)
                .applyAsDouble(10);

        System.out.println(result);

        System.out.println("=================================================");


        DoubleUnaryOperator doubleUnaryOperator_3 = doub -> doub + 2.5;
        DoubleUnaryOperator doubleUnaryOperator_4 = doub -> doub * 3;
        double result_1 = doubleUnaryOperator_3.compose(doubleUnaryOperator_4)
                .applyAsDouble(10);
        System.out.println(result_1);


    }
}
