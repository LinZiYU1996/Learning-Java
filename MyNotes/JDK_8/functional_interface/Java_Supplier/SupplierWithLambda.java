package JDK_8.functional_interface.Java_Supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:08
 * \* Description:
 * \
 */
public class SupplierWithLambda {

//Instantiate Supplier using Lambda Expression
//We will instantiate Supplier here using lambda expression. As we know that its method get() only returns value and does not accept any argument, so our lambda expression will have empty argument part.


    public static void main(String[] args) {

        Supplier<String> stringSupplier = () ->
                "hello world";

        System.out.println(stringSupplier.get());

        System.out.println("");

        Random random = new Random();

        Supplier<Integer> integerSupplier = ()->
                random.nextInt(252);

        System.out.println(integerSupplier.get());
    }
}
