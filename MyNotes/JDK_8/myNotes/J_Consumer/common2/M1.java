package JDK_8.myNotes.J_Consumer.common2;

import JDK_8.myNotes.J_Predicate.common_1.Create_Data;

import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 16:57
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        DoubleConsumer consumer1 = d -> System.out.println(d);

        consumer1.accept(454.002);

        System.out.println("-------------------------");

        IntConsumer consumer2 = i ->
        {
            if (i > 10){
                System.out.println(i);
            }
        };

        List<Integer> integers = Create_Data.supply_Integers();

        for (int i : integers){
            consumer2.accept(i);
        }

        System.out.println("-------------------------");

        LongConsumer consumer3 = l -> System.out.println(l);

        consumer3.accept(15L);



    }
}
