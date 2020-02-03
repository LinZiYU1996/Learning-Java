package JDK_8.myNotes.J_UnaryOperator.the_BinaryOperator.common;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 20:40
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {

        DoubleBinaryOperator doubleBinaryOperator = (d1,d2) ->

                d1*12.36 + d2 * 23.369;

        System.out.println(doubleBinaryOperator.applyAsDouble(10.25,236.69));

        System.out.println("-----------------");


        IntBinaryOperator intBinaryOperator = (i1,i2) ->

                i1 + i2;

        System.out.println(intBinaryOperator.applyAsInt(100,3000));

        System.out.println("-----------------");

        LongBinaryOperator longBinaryOperator = (l1,l2) ->

                l1 * l2;

        System.out.println(longBinaryOperator.applyAsLong(125L,20L));




    }
}
