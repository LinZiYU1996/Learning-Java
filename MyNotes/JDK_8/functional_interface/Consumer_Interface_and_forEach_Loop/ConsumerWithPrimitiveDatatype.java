package JDK_8.functional_interface.Consumer_Interface_and_forEach_Loop;

import java.util.Arrays;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:48
 * \* Description:
 * \
 */
public class ConsumerWithPrimitiveDatatype {

    //IntConsumer, LongConsumer and DoubleConsumer Example
    //Find the consumer classes for primitive data type.
    //IntConsumer : It accepts single int value.
    //LongConsumer : It accepts single long value.
    //DoubleConsumer : It accepts single double value.


    public static void main(String[] args) {


        System.out.println("--IntConsumer--");
        int[] intNum = {3,5,6,10,15};
        IntConsumer intCon = i -> System.out.print(i+" ");

        Arrays.stream(intNum)
                .forEach(intCon);

        System.out.println("");

        System.out.println("\n--LongConsumer--");
        long[] longNum = {13l,9l,6l,10l,15l};
        LongConsumer longCon = l -> System.out.print(l+" ");
        Arrays.stream(longNum).forEach(longCon);

        System.out.println("\n--DoubleConsumer--");
        double[] dbNum = {13.4d,9.1d,6.5d,10.3d,15.3d};
        DoubleConsumer dbCon = d -> System.out.print(d+" ");
        Arrays.stream(dbNum).forEach(dbCon);





    }



}
