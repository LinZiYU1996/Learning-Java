package JDK_8.functional_interface.BiConsumer_BiFunction_and_BiPredicate_Example;

import java.util.function.BiFunction;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:42
 * \* Description:
 * \
 */
public class BiFunctionDemo {

    //BiFunction
    //java.util.function.BiFunction is a functional interface. BiFunction accepts two arguments and returns a value. While declaring BiFunction we need to tell what type of argument will be passed and what will be return type. We can apply our business logic with those two values and return the result. BiFunction has function method as apply(T t, U u) which accepts two argument.


    public static void main(String[] args) {

        BiFunction<Integer,Integer,String> function =

                (n1,n2) -> "R:  " + (n1+n2);

        System.out.println(function.apply(100,200));

    }
}
