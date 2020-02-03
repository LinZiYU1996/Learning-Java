package JDK_8.myNotes.J_Supplier.common_1;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:30
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        DoubleSupplier doubleSupplier = ()->
                454.252;

        System.out.println(doubleSupplier.getAsDouble());

        System.out.println("---------------------");

        IntSupplier intSupplier = ()->
                100;

        System.out.println(intSupplier.getAsInt());


}
}
