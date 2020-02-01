package JDK_8.functional_interface.BooleanSupplier_IntSupplier_LongSupplier_and_DoubleSupplier_Example;

import java.util.function.DoubleSupplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:20
 * \* Description:
 * \
 */
public class DoubleSupplierExample {

    //DoubleSupplier
    //java.util.function.DoubleSupplier is a functional interface that can be used as a Supplier for double values. DoubleSupplier always returns double data type value by the method getAsDouble().



    public static void main(String[] args) {

        Item item = new Item(true,123);
        DoubleSupplier ds = item::getVal;
        System.out.println("Double Value:"+ds.getAsDouble());


    }
}
