package JDK_8.functional_interface.BiConsumer_BiFunction_and_BiPredicate_Example;

import java.util.function.BiPredicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:43
 * \* Description:
 * \
 */
public class BiPredicateDemo {

    //BiPredicate
    //java.util.function.BiPredicate is a functional interface which accepts two argument and returns Boolean value. Apply business logic for the values passed as an argument and return the boolean value. BiPredicate functional method is test(Object, Object). Find the simple example for how to use BiPredicate.

    public static void main(String[] args) {

        BiPredicate<Integer,String> predicate =

                (i,s) -> i>20&&s.startsWith("R");

        System.out.println(predicate.test(10,"dhd"));

        System.out.println(predicate.test(30,"Shyam"));
        System.out.println(predicate.test(30,"Ram"));

    }

}
