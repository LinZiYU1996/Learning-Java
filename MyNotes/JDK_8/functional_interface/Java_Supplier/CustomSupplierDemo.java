package JDK_8.functional_interface.Java_Supplier;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:12
 * \* Description:
 * \
 */
public class CustomSupplierDemo {

//Custom Supplier Functional Interface
//We can create a custom supplier functional interface using @FunctionalInterface annotation. Our supplier we take no argument but return a value of generic type.
    public static void main(String[] args) {

        MySupplier<String> mySupplier = ()->
                "hello";

        System.out.println(mySupplier.fetch());

        System.out.println("");

        //Using Method Reference
        Random random = new Random();
        MySupplier<Integer> s2 = random::nextInt;
        System.out.println(s2.fetch());
        System.out.println("");

        //Using Constructor
        MySupplier<Random> s3 = Random::new;
        Random rdm = s3.fetch();
        System.out.println(rdm.nextInt(10));
        System.out.println("");

    }

    @FunctionalInterface
    interface MySupplier<T> {
        T fetch();
    }

}
