package JDK_8.functional_interface.Java_Supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:11
 * \* Description:
 * \
 */
public class SupplierWithConstructorRef {


//Instantiate Supplier using Default Constructor
//We can instantiate Supplier using constructor with no arguments i.e. default constructor. Find the constructor reference for Book class.
//Book::new Find the sample example to instantiate Supplier using default constructor.
//

    public static void main(String[] args) {

        Supplier<Random> randomSupplier = Random::new;

        Random r1 = randomSupplier.get();

        System.out.println(r1.nextInt());

        System.out.println("");

        Supplier<Book> supplier = Book::new;

        System.out.println(supplier.get());

    }


}
