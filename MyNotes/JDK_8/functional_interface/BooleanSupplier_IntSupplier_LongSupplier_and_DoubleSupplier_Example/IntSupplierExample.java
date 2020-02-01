package JDK_8.functional_interface.BooleanSupplier_IntSupplier_LongSupplier_and_DoubleSupplier_Example;

import java.util.function.IntSupplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:20
 * \* Description:
 * \
 */
public class IntSupplierExample {

//IntSupplier
//java.util.function.IntSupplier is a functional interface that can be used as a Supplier for integer values. IntSupplier always returns integer value by the method getAsInt().



    public static void main(String[] args) {


        Item item = new Item(true,123);
        IntSupplier is = item::getVal;
        System.out.println("Int Value:"+is.getAsInt());


    }
}
