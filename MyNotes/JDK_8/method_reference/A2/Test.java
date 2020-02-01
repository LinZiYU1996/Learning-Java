package JDK_8.method_reference.A2;

import java.util.function.BiPredicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 14:59
 * \* Description:
 * \
 */
public class Test {


    public static void main(String[] args) {

        BiPredicate<String,String> biPredicate

                = (x,y) -> x.equals(y);

        BiPredicate<String,String> biPredicate1

                = String::equals;

        System.out.println(biPredicate.test("a","b"));

        System.out.println(biPredicate1.test("a","a"));



    }
}
