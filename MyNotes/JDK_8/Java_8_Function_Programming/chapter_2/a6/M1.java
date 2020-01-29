package JDK_8.Java_8_Function_Programming.chapter_2.a6;

import thread.c3.c_3_1.c_3_1_4.a3.b2.F;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 10:53
 * \* Description:
 * \
 */
public class M1 {


    public static int compute(int a, int b, BiFunction<Integer,Integer,Integer>
                              function){

        return function.apply(a,b);
    }


    public static int compute_1(int a, int b,
                                BiFunction<Integer,Integer,Integer> function_1,
                                Function<Integer,Integer> function_2){

        return function_1.andThen(function_2).apply(a,b);

    }

    public static void main(String[] args) {

        System.out.println(compute(2,5,
                (x,y) ->
                x + y));

        System.out.println(compute(2,5,
                (x,y) ->
                        x - y));

        System.out.println(compute(2,5,
                (x,y) ->
                        x * y));


        System.out.println("===============================");


//        首先执行(v1, v2) -> v1 + v2，然后执行 v1 -> v1 * v1。
        System.out.println(compute_1(100,200,
                (x,y) -> (x + y),x->x*x));


    }



}
