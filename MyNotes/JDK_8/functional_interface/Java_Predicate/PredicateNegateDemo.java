package JDK_8.functional_interface.Java_Predicate;


import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 19:52
 * \* Description:
 * \
 */
public class PredicateNegateDemo {

//4. negate()
//default Predicate<T> negate() negate is the default method of Predicate that returns a predicate that represents the logical negation of this predicate. If the result of evaluation is true, negate will make it false and if the result of evaluation is false, negate will make it true.


    public static void main(String[] args) {


        Predicate<Integer> predicate = n ->
                n>10 && n <20;

        System.out.println(predicate.test(15));

        System.out.println(predicate.negate().test(15));


    }
}
