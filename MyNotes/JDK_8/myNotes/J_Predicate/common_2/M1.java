package JDK_8.myNotes.J_Predicate.common_2;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 11:32
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        DoublePredicate doubleDoublePredicate = d -> d > 500;

        double[] doubles = {15.5,556.5,225,44585,2565.336};

        for (int i = 0; i < doubles.length; i++) {
            if (doubleDoublePredicate.test(doubles[i])){
                System.out.println(doubles[i]);
            }
        }

        System.out.println("-----------------------");

        IntPredicate intPredicate = i -> i < 100;

        int[] ints = {11,125,55,889,478};

        for (int i = 0; i < ints.length; i++) {
            if (intPredicate.test(ints[i])){
                System.out.println(ints[i]);
            }
        }

        System.out.println("-----------------------");

        LongPredicate longPredicate = l -> l < 5;

        long[] longs = {1L,15L,12L,6L,77L};

        for (int i = 0; i < longs.length; i++) {
            if (longPredicate.test(longs[i])){
                System.out.println(longs[i]);
            }
        }

    }
}
