package JDK_8.myNotes.J_Function.common_1;

import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 17:57
 * \* Description:
 * \
 */
public class M2 {


    public static void main(String[] args) {

        Function<Integer,Integer> function1 = integer ->
                integer + 100;

        Function<Integer,Integer> function2 = integer ->
                integer * 100;


        // 先执行传入的 function2  也就是 * 100
        // 在执行  function1 + 100
        System.out.println(function1.compose(function2).apply(1));

        System.out.println("-------------------------------");

        Function<String,String> function3 = s ->
                s.toUpperCase();

        Function<String,String> function4 = s ->
                s + "---" +s.length();

        System.out.println(function3.compose(function4).apply("abc"));

        System.out.println("-------------------------------");

        Function<Integer,Integer> function5 = integer ->
                integer * 200;

        Function<Integer,Integer> function6 = integer ->
                integer - 200;

        // 先执行 function5  再执行 function6
        System.out.println(function5.andThen(function6).apply(100));



    }
}
