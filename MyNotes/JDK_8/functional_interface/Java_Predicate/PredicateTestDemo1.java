package JDK_8.functional_interface.Java_Predicate;


import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 15:26
 * \* Description:
 * \
 */
public class PredicateTestDemo1 {

    //1. test(T t)
    //boolean test(T t) test is the functional method of Predicate. It evaluates this predicate on the given argument.
    //Example-1:

    public static void main(String[] args) {


        // Is username valid


        Predicate<String> predicate1 = s ->
                s!=null && s.length() > 5 && s.length() < 10;

        System.out.println(predicate1.test("jdjdjd"));

        System.out.println("----------------------------");

        // Word match

        Predicate<String> predicate2 = s ->
                s.startsWith("Mr");

        System.out.println(predicate2.test("Mr. Mahesh")); //true

        System.out.println("----------------------------");

        Predicate<Integer> predicate3 = n ->
                n % 2 == 0;

        for (int i = 0; i < 15; i++) {
            System.out.println(predicate3.test(i));
        }





    }

}
