package JDK_8.functional_interface.BooleanSupplier_IntSupplier_LongSupplier_and_DoubleSupplier_Example;

import java.util.function.LongSupplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:20
 * \* Description:
 * \
 */
public class LongSupplierExample {

    //LongSupplier
    //java.util.function.LongSupplier is a functional interface that can be used as a Supplier for long values. LongSupplier always returns long data type value by the method getAsLong().


    public static void main(String[] args) {

        Item item = new Item(true,123);
        LongSupplier ls = item::getVal;
        System.out.println("Long Value:"+ls.getAsLong());



    }
}
