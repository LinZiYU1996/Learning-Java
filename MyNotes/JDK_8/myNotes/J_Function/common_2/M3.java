package JDK_8.myNotes.J_Function.common_2;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 19:37
 * \* Description:
 * \
 */
public class M3 {

    public static void main(String[] args) {


        BiFunction<Integer,Integer,String> f1 = (x,y) ->
                String.valueOf(x+y);

        System.out.println(f1.apply(100,250));

        System.out.println("-----------------------");

        BiFunction<String,String,String> f2 = (s1,s2) ->
                s1.toUpperCase() + s2.toLowerCase();

        System.out.println(f2.apply("ABCsjhdhdh","POOPjsdhdhd"));

        System.out.println("-----------------------");

        System.out.println(compute3(2, 3, (v1, v2) -> v1 + v2));

        System.out.println("-----------------------");

        System.out.println(compute3(2, 3, (v1, v2) -> v1 - v2));

        System.out.println("-----------------------");

        System.out.println(compute3(2, 3, (v1, v2) -> v1 * v2));

        System.out.println("-----------------------");


        //首先执行(v1, v2) -> v1 + v2，然后执行 v1 -> v1 * v1
        System.out.println(compute4(2, 3, (v1, v2) -> v1 + v2, v1 -> v1 * v1));



    }

    public static int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public static int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
