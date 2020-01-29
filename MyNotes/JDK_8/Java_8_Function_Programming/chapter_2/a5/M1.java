package JDK_8.Java_8_Function_Programming.chapter_2.a5;


import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 22:21
 * \* Description:
 * \
 */
public class M1 {

    public static void main(String[] args) {

        Predicate<Integer> predicate = n ->
                n != 0;

        System.out.println(predicate.test(22));


        System.out.println("====================");

        Predicate<Integer> predicate_1 = n ->

                n != 0;

        predicate_1 = predicate_1.and(n ->
                n >= 100);

        System.out.println(predicate_1.test(555));


        System.out.println("====================");



        Predicate<Integer> predicate_2 = n ->

                n != 0;

        predicate_2 = predicate_2.or( n ->
                n < 10);

        System.out.println(predicate_2.test(0));

        System.out.println("====================");


        Predicate<Integer> predicate_3  = number -> number != 0;

        predicate_3 = predicate_3.negate();

        System.out.println(predicate_3.test(10));


    }
}
