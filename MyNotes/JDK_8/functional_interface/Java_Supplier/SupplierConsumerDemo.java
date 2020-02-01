package JDK_8.functional_interface.Java_Supplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:17
 * \* Description:
 * \
 */
public class SupplierConsumerDemo {


    //Java Supplier vs Consumer
    //Java Supplier and Consumer both are functional interfaces. Supplier represents a supplier of results that returns an object and accepts no arguments whereas Consumer represents an operation that accepts a single input argument and returns no result. Find the method of Supplier functional interface.
    //T get() Find the method of Consumer functional interface.
    //void accept(T t) Now find the sample example.


    public static void main(String[] args) {

        Supplier<String> stringSupplier = Country::getPMName;

        Consumer<String> stringConsumer = Country::printMessage;;

        stringConsumer.accept(stringSupplier.get());

    }
}
