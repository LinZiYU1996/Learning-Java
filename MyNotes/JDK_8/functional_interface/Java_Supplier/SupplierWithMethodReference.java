package JDK_8.functional_interface.Java_Supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:09
 * \* Description:
 * \
 */
public class SupplierWithMethodReference {

    //Instantiate Supplier using Method Reference
    //Method reference invokes method using (::) sign. Suppose we have a class MyUtil and a static method getFavoriteBook() then we can call it using class name.
    //MyUtil::getFavoriteBook If we have non-static method then we can call this method using instance of the class. Suppose myUtil is the instance of MyUtil class and getAge() is non-static method, then we call it using instance as given below.
    //myUtil::getAge As we know that get() method of Supplier functional interface has no arguments, so our methods getFavoriteBook() and getAge() should not accept any argument. Find the example.


    public static void main(String[] args) {

        Supplier<String> stringSupplier = MyUtil::getFavoriteBook;

        System.out.println(stringSupplier.get());

        System.out.println("");

        MyUtil myUtil = new MyUtil();

        Supplier<Integer> integerSupplier = myUtil::getAge;

        System.out.println(integerSupplier.get());

        System.out.println("");

        Random random = new Random();

        Supplier<Integer> integerSupplier1 = random::nextInt;

        System.out.println(integerSupplier1.get());
    }
}
