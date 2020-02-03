package JDK_8.myNotes.J_Function.common_2;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 19:30
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        DoubleFunction<String> doubleFunction = d ->
                String.valueOf(d);

        System.out.println(doubleFunction.apply(12.36));

        System.out.println("-------------------");

        IntFunction<String> intFunction = i ->

                i + "号";

        for (int i = 0; i < 10; i++) {
            System.out.println(intFunction.apply(i));
        }

        System.out.println("-------------------");

        LongFunction<String> longFunction = l ->
                String.valueOf(l);

        System.out.println(longFunction.apply(11L));


    }
}
