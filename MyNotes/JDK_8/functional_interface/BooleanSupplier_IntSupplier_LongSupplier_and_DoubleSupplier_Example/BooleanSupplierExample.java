package JDK_8.functional_interface.BooleanSupplier_IntSupplier_LongSupplier_and_DoubleSupplier_Example;

import java.util.function.BooleanSupplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:19
 * \* Description:
 * \
 */
public class BooleanSupplierExample {

//BooleanSupplier
//java.util.function.BooleanSupplier is a functional interface that can be used as a Supplier for Boolean values. BooleanSupplier always returns boolean value by the method getAsBoolean().


    public static void main(String[] args) {

        Item item = new Item(true,123);

        BooleanSupplier supplier = item::isStatus;

        System.out.println(supplier.getAsBoolean());

    }
}
