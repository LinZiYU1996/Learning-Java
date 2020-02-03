package JDK_8.myNotes.J_Function.common_2;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 19:33
 * \* Description:
 * \
 */
public class M2 {

    public static void main(String[] args) {

        DoubleToLongFunction doubleToLongFunction = (d)->
                (long) d;

        System.out.println(doubleToLongFunction.applyAsLong(12.36));

        System.out.println("------------");

        DoubleToIntFunction doubleToIntFunction = d ->
                (int) (d+100);

        System.out.println(doubleToIntFunction.applyAsInt(125.369));

    }
}
