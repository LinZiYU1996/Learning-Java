package JDK_8.functional_interface.Java_Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:07
 * \* Description:
 * \
 */
public class Note {

    //Java Supplier is a functional interface that represents a supplier of results. The functional method of Supplier is get(). A Supplier can be instantiated using lambda expression or method reference or default constructor. The Supplier has been introduced in Java 8 and belongs to java.util.function package. The source code of Supplier functional interface is as following.


    //@FunctionalInterface
    //public interface Supplier<T> {
    //    T get();
    //}

    //We can see in the above code that Supplier has get() method that returns generic type value. The method get() will not accept any argument and only return the value of generic type. We can instantiate Supplier as following.

    //Supplier<String> s = () -> "Hello World!";


    //Java also provides suppliers that returns value of specific type. BooleanSupplier returns Boolean data type, IntSupplier returns integer data type, LongSupplier returns long data type and DoubleSupplier returns double data type values. We can also create custom functional interface according to our requirements.


    //Contents
    //Instantiate Supplier using Lambda Expression
    //Instantiate Supplier using Method Reference
    //Instantiate Supplier using Default Constructor
    //Custom Supplier Functional Interface
    //BooleanSupplier, IntSupplier, LongSupplier, DoubleSupplier
    //Java Supplier vs Consumer
    //References


}
