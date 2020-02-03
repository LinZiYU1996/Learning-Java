package JDK_8.myNotes.J_UnaryOperator.common_1;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 20:17
 * \* Description:
 * \
 */
public class M2{

    public static void main(String[] args) {

        DoubleUnaryOperator o1 = d ->

                d + d * 12.36;

        System.out.println(o1.applyAsDouble(12.58));

        System.out.println("-------------------------");

        IntUnaryOperator o2 = i ->
                (int) (i * 100 + 236.22);

        System.out.println(o2.applyAsInt(121));

        System.out.println("-------------------------");

        LongUnaryOperator longUnaryOperator = l ->

                (long) (l * 12.36 + 96.33);

        System.out.println(longUnaryOperator.applyAsLong(1212));



    }
}
