package JDK_8.functional_interface.Java_Supplier;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:14
 * \* Description:
 * \
 */
public class SpecificDataTypeSupplier {

    //BooleanSupplier, IntSupplier, LongSupplier, DoubleSupplier
    //Java provides following functional interfaces that are used for specific data type supplier.
    //BooleanSupplier: Supplier to return Boolean value. Its method is getAsBoolean().
    //IntSupplier: Supplier to return integer data type value. Its method is getAsInt().
    //LongSupplier: Supplier to return long data type value. Its method is getAsLong().
    //DoubleSupplier: Supplier to return double data type value. Its method is getAsDouble().


    public static void main(String[] args) {

        int age = 30;

        BooleanSupplier booleanSupplier = () -> age>56;

        System.out.println(booleanSupplier.getAsBoolean());

        System.out.println("");

        Random random = new Random();

        IntSupplier intSupplier = random::nextInt;

        System.out.println(intSupplier.getAsInt());

        System.out.println("");

        LongSupplier longSupplier = random::nextLong;

        System.out.println(longSupplier.getAsLong());

        System.out.println("");

        DoubleSupplier ds = random::nextDouble;

        System.out.println(ds.getAsDouble());


    }
}
